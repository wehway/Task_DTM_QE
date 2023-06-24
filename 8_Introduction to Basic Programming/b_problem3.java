public class b_problem3 {
    private static void drawXYZ(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("Y");
                } else if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("Z");
                } else if (i % 3 == 0 && j % 3 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }

}
