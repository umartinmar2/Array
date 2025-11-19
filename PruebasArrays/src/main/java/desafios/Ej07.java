package desafios;

public class Ej07 {
    public static void main(String[] args) {

        int[] array1 = creaArray(10);
        int[] array2 = creaArray(5);
        int[] arrayTotal = sumaArrays(array1,array2);
        imprimirArray(array1);
        imprimirArray(array2);
        imprimirArray(arrayTotal);

//        int [] array1= new int[5];
//        int [] array2 = new int[5];
//        int [] arrayTotal = new int[5];
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = (int) (Math.random() * 10 + 1);
//            array2[i] = (int) (Math.random() * 10 + 1);
//        }
//        for (int i = 0; i < arrayTotal.length; i++) {
//            arrayTotal[i]=array1[i]+array2[i];
//        }
//        for (int i = 0; i < arrayTotal.length ; i++) {
//            System.out.println("array1["+i+"]="+array1[i]);
//            System.out.println("array2["+i+"]="+array2[i]);
//            System.out.println("arrayTotal["+i+"]="+arrayTotal[i]);
//        }
    }




    private static int[] sumaArrays(int[] array1, int[] array2) {
        int[] array = new int [Math.max(array1.length,array2.length)];

        //Asigna que array es el grande y cual el pequeño
        int[] aPeq = array1;
        int[] aGran = array2;
        if (array1.length>array2.length){
            aPeq = array2;
            aGran = array1;
        }
        // Suma los arrays mientras la posición exista en el array pequeño
        for (int i = 0; i < aPeq.length; i++) {
            array[i]=aGran[i]+aPeq[i];
        }
        // Copia el array grande al arrayTotal cuando la posición no existe en el array pequeño
        for (int i = aPeq.length; i < aGran.length ; i++) {
            array[i]=aGran[i];
        }
        return array;
    }

    private static int[] creaArray(int t) {
        int[] array = new int [t];
        for (int i = 0; i < t; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        return array;
    }

    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
}
