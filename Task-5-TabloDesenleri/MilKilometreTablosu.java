public class MilKilometreTablosu {
    public static void main(String[] args) {
        double[] milDegerleri = {1, 5, 10, 20, 50};
        double katsayi = 1.609;

        System.out.println("Mil -> Kilometre Dönüşüm Tablosu");
        System.out.println("=================================");
        System.out.printf("%-10s %-15s%n", "Mil", "Kilometre");
        System.out.println("=================================");

        for (double mil : milDegerleri) {
            double km = mil * katsayi;
            System.out.printf("%-10.1f %-15.3f%n", mil, km);
        }

        System.out.println("=================================");
    }
}
