public class InvertedHalfPyramidWithNums {

    public static void Inverted_Pyramid_Num(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move inside outer loop
        }
    }

    public static void main(String[] args) {
        Inverted_Pyramid_Num(5);
    }
}