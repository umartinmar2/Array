package intro;

import java.util.Scanner;

public class Ej02 {


    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random()*10+1);
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println("array["+i+"]="+array[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero entre el 1 y 10 para verificar si esta en el array:");
        int n = Integer.parseInt(sc.nextLine());
        int posicion = 0;
        for (int i = 0; i < 5 ; i++) {
            if (n == array[i]){
                posicion = i+1;
                break;
            }
        }
        if (posicion==-1){
            System.out.println("El número no se a encontrado en el array.");
        }
        else{
            System.out.println("El número esta en el array en la posición"+posicion);
        }
    }
}

