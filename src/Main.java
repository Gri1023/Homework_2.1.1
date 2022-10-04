public class Main {
    public static void main(String[] args) {
        System.out.println("first task:");
        int[] a = {0, 0, 0, 0, 0};
            for (int j =1;j<=5;j++) {
                for (int i = 0; i < a.length; i++) {
                    a[i] = i + 1;
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }

        System.out.println();
        System.out.println("second task:");

        for (int i = 1; i <= 5; i++) {
            int g = i;
            for (int d = 1; d <= 5; d++) {
                System.out.print(g + " ");
                g++;
            }
            System.out.println();
        }
    }
}
