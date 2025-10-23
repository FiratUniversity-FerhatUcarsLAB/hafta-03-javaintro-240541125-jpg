public class IsimKarti {
    public static void main(String[] args) {
        
        String ad = "Şevval";
        String soyad = "Bulut";
        String ogrNo = "240541125";
        String bolum = "Yazılım Mühendisliği";

        
        System.out.println("=====================================");
        System.out.println("|           ÖĞRENCİ KARTI           |");
        System.out.println("=====================================");
        System.out.printf("| %-10s: %-24s |\n", "Ad", ad);
        System.out.printf("| %-10s: %-24s |\n", "Soyad", soyad);
        System.out.printf("| %-10s: %-24s |\n", "Öğrenci No", ogrNo);
        System.out.printf("| %-10s: %-24s |\n", "Bölüm", bolum);
        System.out.println("=====================================");
    }
}
