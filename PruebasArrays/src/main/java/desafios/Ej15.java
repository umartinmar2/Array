package desafios;

public class Ej15 {
    public static void main(String[] args) {
        int a [] = {11,4,2,3,5,6};
        int m1 = a[0];
        int m2 = Integer.MIN_VALUE;

        for (int i = 1; i <a.length ; i++) {
            if (a[i] > m1){
                m2=m1;
                m1=a[i];

            } else if (a[i] > m2) {
                m2=a[i];
            }
        }
        System.out.println(m1+" "+m2);
    }
}
