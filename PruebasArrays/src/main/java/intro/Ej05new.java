package intro;

public class Ej05new {
    public static void main(String[] args) {
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println("array["+i+"]="+array[i]);
        }
        int mayorNumero = -1;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            mayorNumero=Math.max(array[i], mayorNumero);
        }
        System.out.println("\nEl array de mayor tamaño tiene el valor = "+mayorNumero);
    }
}
