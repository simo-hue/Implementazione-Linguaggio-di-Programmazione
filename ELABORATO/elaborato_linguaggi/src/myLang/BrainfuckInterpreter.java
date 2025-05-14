package myLang;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Semplice interprete Brainfuck su array di byte.
 */
public class BrainfuckInterpreter {
    /**
     * Esegue il codice Brainfuck.
     * @param code la stringa di comandi BF (+-<>[],.)
     * @param in input da ',' (System.in)
     * @param out output per '.' (System.out)
     */
    public static void run(String code, InputStream in, OutputStream out) throws IOException {
        byte[] mem = new byte[30000];
        int ptr = 0;

        for (int pc = 0; pc < code.length(); pc++) {
            char c = code.charAt(pc);
            switch (c) {
                case '>': ptr++; break;
                case '<': ptr--; break;
                case '+': mem[ptr]++; break;
                case '-': mem[ptr]--; break;
                case '.': out.write(mem[ptr]); out.flush(); break;
                case ',': mem[ptr] = (byte) in.read(); break;

                case '[':
                    if (mem[ptr] == 0) {
                        // salto in avanti finché non trovo la parentesi corrispondente
                        int depth = 1;
                        while (depth > 0) {
                            pc++;
                            if (pc >= code.length()) break;
                            if (code.charAt(pc) == '[') depth++;
                            else if (code.charAt(pc) == ']') depth--;
                        }
                    }
                    break;

                case ']':
                    if (mem[ptr] != 0) {
                        // salto indietro finché non trovo la parentesi corrispondente
                        int depth = 1;
                        while (depth > 0) {
                            pc--;
                            if (pc < 0) break;
                            if (code.charAt(pc) == ']') depth++;
                            else if (code.charAt(pc) == '[') depth--;
                        }
                    }
                    break;

                default:
                    // ignora tutto il resto
            }
        }
    }
}