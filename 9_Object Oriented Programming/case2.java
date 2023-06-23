public class case2 {
    public static void main(String[] args) {
        int sisiKubus = 10;
        int panjangBalok = 3;
        int lebarBalok = 6;
        int tinggiBalok = 10;
        double jariTabung = 7;
        double tinggiTabung = 10;

        double volumeKubus = hitungVolumeKubus(sisiKubus);
        double volumeBalok = hitungVolumeBalok(panjangBalok, lebarBalok, tinggiBalok);
        double volumeTabung = hitungVolumeTabung(jariTabung, tinggiTabung);

        System.out.println("Volume");
        System.out.println("Kubus: " + volumeKubus);
        System.out.println("Balok: " + volumeBalok);
        System.out.println("Tabung: " + volumeTabung);
    }

    public static double hitungVolumeKubus(int sisi) {
        return Math.pow(sisi, 3);
    }

    public static double hitungVolumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public static double hitungVolumeTabung(double jari, double tinggi) {
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }
}
