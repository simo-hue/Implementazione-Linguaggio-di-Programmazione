/**
 * Per gestire in modo separato la registrazione e il lookup delle funzioni utente.
 */

package myLang;

import java.util.HashMap;
import java.util.Map;

/**
 * FunctionRegistry gestisce la registrazione e il lookup delle funzioni utente.
 * Memorizza i contesti di dichiarazione FunDeclContext associati ai nomi delle funzioni.
 */
public class FunctionRegistry {
    private static final Map<String, GrammaticaParser.FunDeclContext> functions = new HashMap<>();

    /**
     * Registra una funzione con il suo contesto di dichiarazione.
     * @param name Nome della funzione
     * @param ctx  Contesto FunDeclContext generato da ANTLR
     */
    public static void register(String name, GrammaticaParser.FunDeclContext ctx) {
        functions.put(name, ctx);
    }

    /**
     * Restituisce il contesto di dichiarazione per la funzione data, o null se non esiste.
     */
    public static GrammaticaParser.FunDeclContext get(String name) {
        return functions.get(name);
    }

    /**
     * Verifica se esiste una funzione registrata con il nome dato.
     */
    public static boolean exists(String name) {
        return functions.containsKey(name);
    }
}
