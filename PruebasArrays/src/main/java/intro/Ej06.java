package intro;

public class Ej06 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}
