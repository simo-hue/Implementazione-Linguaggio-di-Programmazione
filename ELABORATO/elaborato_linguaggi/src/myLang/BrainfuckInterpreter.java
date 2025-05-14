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
        byte[] mem = new byte[30000];   // 30k celle
        int ptr = 0;

        // Pre‐elabora i salti [→] e ]→[
        Map<Integer,Integer> jumps = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '[') {
                stack.push(i);
            } else if (c == ']') {
                int open = stack.pop();
                jumps.put(open, i);
                jumps.put(i, open);
            }
        }

        // Esecuzione linea‐per‐linea
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
                    if (mem[ptr] == 0) pc = jumps.get(pc);
                    break;
                case ']':
                    if (mem[ptr] != 0) pc = jumps.get(pc);
                    break;
                default:
                    // ignora qualsiasi altro carattere
            }
        }
    }
}