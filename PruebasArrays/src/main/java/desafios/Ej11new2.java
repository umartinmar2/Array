
package desafios;

import java.util.Arrays;

public class Ej11new2 {

    public static void main(String[] args) {

        int[] a = dameArrayAleatorioNoRepetidos(10);
//        int[] b = {4, 3, 2, 5, 3, 4, 3, 2, 5, 3};
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Coinciden los valores con índices: ");

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                System.out.printf("%d ", i);
            }
        }

        System.out.println();
        System.out.println("Coinciden los valores de a en b en otra posición: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] == b[j] && i != j){
                    System.out.printf("%d ", i);
                    break;
                }
            }
        }

    }

    private static int[] dameArrayAleatorioNoRepetidos(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int v = dameValorQueNoEsta(a, i);
            a[i] = v;
        }
        return a;
    }

    private static int dameValorQueNoEsta(int[] a, int pos) {
        int v = (int) (Math.random()*10);
        boolean esta = false;
        while (true) {
            for (int j = 0; j < pos; j++) {
                if (a[j] == v) {
                    esta = true;
                    v = (int) (Math.random()*10);
                    break;
                }
            }
            if (!esta) {
                return v;
            }
            esta = false;
        }
    }
}

