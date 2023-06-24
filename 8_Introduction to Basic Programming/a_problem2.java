public class a_problem2 {
    public static void main(String[] args) {
        int nilaiMahasiswa = 99;
        String nilaiHuruf;
    
        if (nilaiMahasiswa >= 80 && nilaiMahasiswa <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiMahasiswa >= 65 && nilaiMahasiswa <= 79) {
            nilaiHuruf = "B+";
        } else if (nilaiMahasiswa >= 50 && nilaiMahasiswa <= 64) {
            nilaiHuruf = "B";
        } else if (nilaiMahasiswa >= 35 && nilaiMahasiswa <= 49) {
            nilaiHuruf = "C";
        } else {
            nilaiHuruf = "Nilai Tidak Valid";
        }

        System.out.println("Nilai Huruf: " + nilaiHuruf);
    }
 }
