public class Main {
    public static void main(String[] args) {
        // For döngüsü ile 1'den 5'e kadar sayıları yazdırma
        System.out.println("For Döngüsü:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sayı (For): " + i);
        }

        // While döngüsü ile 1'den 5'e kadar sayıları yazdırma
        System.out.println("\nWhile Döngüsü:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Sayı (While): " + j);
            j++;
        }

        // For döngüsü ile çift sayıları bulma
        System.out.println("\nFor Döngüsü ile Çift Sayılar:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // While döngüsü ile çift sayıları bulma
        System.out.println("\nWhile Döngüsü ile Çift Sayılar:");
        int k = 1;
        while (k <= 10) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }
    }
}