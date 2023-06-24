public class b_problem1 {
    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3)); // Output: 8
        System.out.println(power(5, 3)); // Output: 125
        System.out.println(power(10, 2)); // Output: 100
        System.out.println(power(2, 5)); // Output: 32
        System.out.println(power(7, 3)); // Output: 343
    }
}
