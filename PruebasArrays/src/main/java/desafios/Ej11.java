package desafios;

public class Ej11 {
    public static void main(String[] args) {
        int tam =5;
        int []a1 = crearArray(tam);
        int []a2 = crearArray(tam);
        imprimirArray(a1);
        imprimirArray(a2);
        compararArrays(a1,a2);
    }


    private static int[] crearArray(int tam) {
        int []array = new int[tam];
        for (int i = 0; i <tam ; i++) {
            array[i]= (int) (Math.random()*10+1);
        }
        return array;
    }

    private static void compararArrays(int[] a1, int[] a2) {
        for (int i = 0; i < a1.length ; i++) {
            if (a1[i] == a2[i]){
                System.out.println("valor de array que coincide: "+a1[i]+"  idx: "+i);
            }
        }
    }
    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
}
