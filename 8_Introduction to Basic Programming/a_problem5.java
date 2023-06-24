public class a_problem5 {
        public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;

        System.out.println(num1 + " adalah bilangan prima? " + isPrime(num1));
        System.out.println(num2 + " adalah bilangan prima? " + isPrime(num2));
    }
}
