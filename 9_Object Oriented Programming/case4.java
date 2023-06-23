public class case4 {
    public static void main(String[] args) {
        int panjang = 5;
        int lebar = 2;
        int tinggi = 4;
        int berat = 1;
        int volume = panjang * lebar * tinggi;
        int harga = hitungHarga(volume, berat);
        
        System.out.println("Harga: Rp " + harga);
    }

    public static int hitungHarga(int volume, int berat) {
        int hargaStandar = 5000;
        int volumeMinimal = 50;

        if (volume >= volumeMinimal) {
            int beratKg = (berat + 999) / 1000;
            int harga = hargaStandar * beratKg;
            return harga;
        } else {
            return hargaStandar;
        }
    }
}
