public class b_problem4 {
    private static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 9;
        printMultiplicationTable(n);
    }
}
