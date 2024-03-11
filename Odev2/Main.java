public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Ogrenci ogrenci1 = new Ogrenci("1973104001", 0.0);
        Ogrenci ogrenci2 = new Ogrenci("Gökhan", "Bilgisayar Müh", "1985104001", 0.0, 1985);
        Ogrenci ogrenci3 = new Ogrenci("Ayşe", "Makine Müh", "1985104001", 0.0, 1985);
        Ogrenci ogrenci4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh", "2020104001", 1.98, 2020);

        System.out.println("Öğrencilerin Bilgileri");
        System.out.println("OGR-1 " + ogrenci1);
        System.out.println("OGR-2 " + ogrenci2);
        System.out.println("OGR-3 " + ogrenci3);
        System.out.println("OGR-4 " + ogrenci4);
        System.out.println("3. Öğrencinin ödeyeceği harç: " + ogrenci3.harcHesapla());
        System.out.println("4. Öğrencinin ödeyeceği harç: " + 2*ogrenci4.harcHesapla());

    }

    public static void Gano(double gano) throws IllegalAccessException {
        if (gano < 0 || gano > 4) {
            throw new IllegalAccessException("Geçerli bir gano giriniz!!!");
        }

    }
}