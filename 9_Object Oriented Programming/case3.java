public class case3 {
    public static void main(String[] args) {
        int angka1 = 3;
        int angka2 = 4;

        int hasilPenjumlahan = penjumlahan(angka1, angka2);
        int hasilPengurangan = pengurangan(15, 4);
        int hasilPerkalian = perkalian(10, 10);
        double hasilPembagian = pembagian(12, 3);

        System.out.println("Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilPerkalian);
        System.out.println("Pembagian: " + hasilPembagian);
    }

    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static double pembagian(double a, double b) {
        return a / b;
    }

}
