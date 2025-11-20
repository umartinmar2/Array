package desafios;

public class Ej11new {
    public static void main(String[] args) {
        int tam =10;
        int [] a2 = {0,1,2,3,4,5,6,7,8,9};
//        int [] a2= crearArray(tam);
        int [] a1 = dameArrayAleatorioNoRepetido(tam);
        numArrayCoinciden(a1,a2);
        imprimirArray(a1);
        imprimirArray(a2);
        compararArrays(a1,a2);
    }

    private static int[] dameArrayAleatorioNoRepetido(int tam) {
        int []array = new int[tam];
        for (int i = 0; i < tam; i++) {
            int v = dameValorQueNoEsta(array,i);
            array[i] = v;
        }
        return array;
    }

    private static int dameValorQueNoEsta(int[] array, int pos) {
        int v = (int) (Math.random()*10);
        boolean esta = false;
        while (true){
            for (int j = 0; j < pos; j++) {
                if(array[j] == v){
                    esta = true;
                    v = (int) (Math.random()*10);
                    break;
                }

            }
            if(!esta){
                return v;
            }
            esta = false;
        }
    }

    private static int[] crearArray(int tam) {
        int []array = new int[tam];
        for (int i = 0; i <tam ; i++) {
            array[i]= (int) (Math.random()*10);
        }
        return array;
    }

    private static void compararArrays(int[] a1, int[] a2) {
        for (int i = 0; i < a1.length ; i++) {
            if (a1[i] == a2[i]){
                System.out.println("El valor["+a1[i]+"] coincide en ambos array en el idx["+i+"]");
            }
        }

    }
    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }

    private static void numArrayCoinciden(int[] a1, int[] a2) {
        System.out.print("Estos números estan en ambos arrays pero no posición \n[");
        for (int i = 0; i <a1.length ; i++) {
            int num = a1[i];
            for (int j = 0; j <a2.length ; j++) {
                if (num==a2[j] && i!=j){
                    System.out.print(num+", ");
                }
            }
        }
        System.out.print("]\n");
    }

}
