package String;

import java.util.Arrays;

public class Ej18 {
    public static void main(String[] args) {
        String s = "Una palabra muy larga ";
        String [] palabras = s.split(" ");

        int t =0;

        for (int i = 0; i < palabras.length ; i++) {
            t+= palabras[i].length();
        }

        char[] a = new char[t];
        int k = 0;

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length() ; j++) {
                a[k++] = palabra.charAt(j);
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
