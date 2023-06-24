import java.util.Scanner;

public class a_problem3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan: ");
            int num = scanner.nextInt();

            System.out.println("Faktor dari bilangan " + num + " adalah:");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
