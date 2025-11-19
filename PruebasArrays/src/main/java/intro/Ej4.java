package intro;

public class Ej4 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random()*10+1);
        }
        int pares = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i]%2==1){
                pares++;
                System.out.println("array["+i+"] = "+array[i]+" ");
            }
        }
        System.out.println("\nHay un total de "+pares+" números impares.");
    }
}
