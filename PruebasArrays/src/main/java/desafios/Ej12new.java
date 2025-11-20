package desafios;

public class Ej12new {

    public static void main(String[] args) {
        int[] a = dameImagen();
        int[] h = dameHistograma(a);
        pintarHistograma(h);
    }


    private static int[] dameImagen() {
        int[] a = new int[32*32];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*256);
        }
        return a;
    }
    private static int[] dameHistograma(int[] a) {
        int[] h = new int[256];
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            h[v] = h[v] + 1;
            //h[a[i]] = h[a[i]] + 1;
        }
        return h;
    }

    private static void pintarHistograma(int[] h) {
        for (int i = 0; i < h.length; i++) {
            System.out.printf("%3d | ", i);
            for (int j = 0; j < h[i]; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }


}
