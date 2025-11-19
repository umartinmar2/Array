package desafios;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        int[]array = crearArray(10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Que numero quieres comprobar? ");
        int numero = Integer.parseInt(sc.nextLine());
        int contador = comprobarArray(numero,array);
        System.out.println("El número "+numero+" esta "+contador+" veces." );
        imprimirArray(array);
    }

    private static int comprobarArray(int num, int[] array) {
        int contador = 0;
        for (int j = 0; j < array.length ; j++) {
            if (array[j]==num){
                contador++;
            }
        }
        return contador;
    }

    private static int[] crearArray(int tam) {
        int[] a = new int [tam];
        for (int i = 0; i < tam; i++) {
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
