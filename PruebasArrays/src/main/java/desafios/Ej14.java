package desafios;

import java.util.Arrays;

public class Ej14 {

    public static void main(String[] args) {
        int[] a = {4, 1, 9, 3, 7, 2};

        System.out.println(Arrays.toString(a));
        int numMayor = Integer.MIN_VALUE;
        int idxMayor = -1;
        int numMenor = Integer.MAX_VALUE;
        int idxMenor = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > numMayor) {
                numMayor = a[i];
                idxMayor = i;
            }
            if (a[i] < numMenor) {
                numMenor = a[i];
                idxMenor = i;
            }
        }

        a[idxMayor] = numMenor;
        a[idxMenor] = numMayor;

        System.out.println(Arrays.toString(a));
    }
}
