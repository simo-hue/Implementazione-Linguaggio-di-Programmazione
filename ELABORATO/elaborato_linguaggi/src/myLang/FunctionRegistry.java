package myLang;

import java.util.HashMap;
import java.util.Map;

/**
 * FunctionRegistry gestisce la registrazione e il lookup delle funzioni utente.
 * Memorizza i contesti di dichiarazione FunDeclContext associati ai nomi delle funzioni.
 */
public class FunctionRegistry {
    // Mappa statica nomeFunzione -> contesto della dichiarazione
    private static final Map<String, GrammaticaParser.FunDeclContext> functions = new HashMap<>();

    /**
     * Registra una funzione utente associando il nome al suo contesto di dichiarazione.
     * @param name nome della funzione
     * @param ctx contesto di dichiarazione FunDeclContext
     */
    public static void register(String name, GrammaticaParser.FunDeclContext ctx) {
        functions.put(name, ctx);
    }

    /**
     * Restituisce il contesto di dichiarazione associato al nome della funzione.
     * @param name nome della funzione
     * @return FunDeclContext o null se non registrata
     */
    public static GrammaticaParser.FunDeclContext lookup(String name) {
        return functions.get(name);
    }

    /**
     * Verifica se una funzione con il dato nome è stata registrata.
     * @param name nome della funzione
     * @return true se la funzione è definita
     */
    public static boolean isDefined(String name) {
        return functions.containsKey(name);
    }

    /**
     * Pulisce tutte le funzioni registrate (utile in contesti di test).
     */
    public static void clear() {
        functions.clear();
    }
}
