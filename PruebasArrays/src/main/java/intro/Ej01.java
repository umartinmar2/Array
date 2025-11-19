package intro;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        System.out.print("Introduce el tamaño del array: ");
        int n = Integer.parseInt(sc.nextLine());
        array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = (int) (Math.random()*100) +1;
        }
        for (int i = 0; i < n ; i++) {
            System.out.println("array[" + i +"] = "+array[i]);
        }
        int suma = 0;
        //TODO sumar
        for (int i = 0; i < n; i++) {
            suma += array[i];
        }
        System.out.println("La suma es: "+suma);
    }
}
