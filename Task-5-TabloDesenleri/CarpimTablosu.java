public class CarpimTablosu {
    public static void main(String[] args) {
        int sayi = 2; // Çarpım tablosu oluşturulacak sayı

        System.out.println(sayi + " sayısının çarpım tablosu:");
        System.out.println("==============================");

        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " x " + i + " = " + (sayi * i));
        }

        System.out.println("==============================");
    }
}
