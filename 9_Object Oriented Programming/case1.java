public class case1 {
    public static double hitungLuasPersegi(double sisi) {
        double luas = sisi * sisi;
        return luas;
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static double hitungKelilingPersegi(double sisi) {
        double keliling = 4 * sisi;
        return keliling;
    }

    public static double hitungKelilingSegitiga(double sisi1, double sisi2) {
        double keliling = sisi1 + sisi2 + Math.sqrt(sisi1 * sisi1 + sisi2 * sisi2);
        return keliling;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public static void main(String[] args) {
        double sisiPersegi = 4;
        double alasSegitiga = 3;
        double tinggiSegitiga = 4;
        double panjangPersegiPanjang = 7.8;
        double lebarPersegiPanjang = 7.8;

        double luasPersegi = hitungLuasPersegi(sisiPersegi);
        double luasSegitiga = hitungLuasSegitiga(alasSegitiga, tinggiSegitiga);
        double luasPersegiPanjang = hitungLuasPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        double kelilingPersegi = hitungKelilingPersegi(sisiPersegi);
        double kelilingSegitiga = hitungKelilingSegitiga(alasSegitiga, tinggiSegitiga);
        double kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        System.out.println("Luas Persegi: " + luasPersegi);
        System.out.println("Luas Segitiga: " + luasSegitiga);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);

        System.out.println("Keliling Persegi: " + kelilingPersegi);
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }
}
