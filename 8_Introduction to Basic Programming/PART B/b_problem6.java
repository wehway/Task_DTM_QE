public class b_problem6 {
    private static float calculateMean(float[] numbers) {
        float sum = 0;

        for (float number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        float[] values = {1, 2, 3, 4};
        float mean = calculateMean(values);

        System.out.println(mean);
    }
}
