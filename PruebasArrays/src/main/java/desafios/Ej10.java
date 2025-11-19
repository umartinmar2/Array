package desafios;

public class Ej10 {
    public static void main(String[] args) {
        int tam = 6;
        int[]array = crearArray(tam);
        int[]arrayDesplazado = desplazarArray(array);
        imprimirArray(array);
        imprimirArray(arrayDesplazado);
    }

    private static int[] desplazarArray(int[] array) {
        int[] arrayDesplazado = new int[array.length];
        int ulti = array[array.length-1];
        for (int i = 0; i < array.length-1 ; i++) {
            arrayDesplazado[i+1]= array[i];
        }
        // Asigna el último valor del array al primer valor del array desplazado.
        arrayDesplazado[0]=ulti;
        return arrayDesplazado;
    }

    private static int[] crearArray(int tam) {
        int[] a = new int[tam];
        for (int i = 0; i < tam ; i++) {
            a[i]= (int) (Math.random()*10+1);
        }
        return a;
    }
    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
}
