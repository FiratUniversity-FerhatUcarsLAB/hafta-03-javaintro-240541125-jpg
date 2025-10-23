public class HesapOzeti {
    public static void main(String[] args) {
        // Başlık
        System.out.println("========================================");
        System.out.printf("%-15s %-10s %-10s%n", "Ürün", "Miktar", "Fiyat (₺)");
        System.out.println("========================================");

        // Ürün listesi
        System.out.printf("%-15s %-10d %-10.2f%n", "Elma", 3, 45.0);
        System.out.printf("%-15s %-10d %-10.2f%n", "Ekmek", 2, 15.5);
        System.out.printf("%-15s %-10d %-10.2f%n", "Süt", 1, 22.75);
        System.out.printf("%-15s %-10d %-10.2f%n", "Çay", 1, 80.0);

        System.out.println("========================================");

        // Toplam hesap
        double toplam = 3 * 45.0 + 2 * 15.5 + 1 * 22.75 + 1 * 80.0;
        System.out.printf("%-25s %-10.2f%n", "Toplam Tutar:", toplam);
        System.out.println("========================================");
    }
}
