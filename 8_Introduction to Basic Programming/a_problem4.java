import java.util.Scanner;

public class a_problem4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan: ");
            int num = scanner.nextInt();

            System.out.println("Faktor dari bilangan " + num + " adalah:");
            for (int i = num; i >= 1; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
