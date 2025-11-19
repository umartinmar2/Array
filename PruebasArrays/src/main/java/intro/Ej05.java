package intro;

public class Ej05 {
    public static void main(String[] args) {
        int[] array = new int[7];

        for (int i = 0; i < 7; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 7 ; i++) {
            System.out.println("array["+i+"]="+array[i]);
        }
        int mayorNumero = -1;
        int idx = -1;
        for (int i = 0; i < 7; i++) {
            if (array[i]>mayorNumero){
                mayorNumero= array [i];
                idx = i;
            }
        }
        System.out.println("\nEl array de mayor tamaño es el array["+idx+"] = "+mayorNumero);
    }
}
