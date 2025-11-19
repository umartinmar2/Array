package intro;

public class Ej03 {

    public static void main(String[] args) {
        int[] array = crearArrayAleatorio(10);
        int pares = cuentaPares(array);
        imprimePares(array);
        System.out.println("Hay un total de "+pares+" números pares.");

    }

    /**
     * Crea un array aleatorio con el tamaño que recibe.
     * @param tam
     * @return
     */
    private static int[] crearArrayAleatorio(int tam) {
        int [] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            array[i] = (int) (Math.random()*10+1);
        }
        return array;
    }

    /**
     * Imprime los numeros pares del array
     * @param array
     */
    private static void imprimePares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                System.out.println("array["+i+"] = "+array[i]+" ");
            }
        }
    }

    /**
     * Cuenta la cantidad de numeros pares del array
     * @param array
     * @return
     */
    private static int cuentaPares(int[] array) {
        int numPares = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){;
                numPares++;
            }
        }
        return numPares;
    }


}
