package intro;

public class Ej03new {
    public static void main(String[] args) {
        // Crea un array con 10 números aleatorios [1-10]
        int[] array = creaArrayAleatorio(10);
        //  Imprime array
        imprimeArray(array);
        // Indica cúantos números pares hay
        int num = cuentaPares(array);
        System.out.println("\nHay " + num + " valores \n");
        // Obtiene un  array con solo los números pares
        int[] pares = dameArraySoloPares(array);
        //  Imprime array
        System.out.println("Este seria un array realizado con los números pares del array anterior.");
        imprimeArray(pares);

    }

    private static void imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array["+i+"] = "+array[i]);
        }
    }


    private static int[] dameArraySoloPares(int[] array) {
        int [] pares;
        // Instancia pares con el tamaño adecuado
        pares = new int[cuentaPares(array)];
        // Copia valores pares de array en pares
        int k = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                pares[k]=array[i];
                k++;
                // También se podría hacer de esta manera
                // pares[k++]=array[i];
            }
        }
        return pares;
    }

    private static int[] creaArrayAleatorio(int tam) {
        int[] array = new int[tam];
        for (int i = 0; i < tam ; i++) {
            array [i] = (int) (Math.random() * 10 + 1);
        }
        return array;
    }

    private static void imprimePares(int[] array) {
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * Cuenta el número de elementos que son pares
     * @param array referencia la array que se comprueba (no es null)
     * @return cantidad de números pares [0-array.length]
     */
    public static int cuentaPares(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                num++;
            }
        }
        return num;
    }

}
