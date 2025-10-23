public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("Üslü Sayılar Tablosu");
        System.out.println("===========================");
        System.out.printf("%-5s %-8s %-8s%n", "a", "a^2", "a^3");
        System.out.println("===========================");

        for (int a = 1; a <= 5; a++) {
            int aKare = a * a;
            int aKup = a * a * a;
            System.out.printf("%-5d %-8d %-8d%n", a, aKare, aKup);
        }

        System.out.println("===========================");
    }
}
