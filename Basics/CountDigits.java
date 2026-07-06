public class CountDigits {

    public static void main(String[] args) {

        int n = 6678;

        // Edge Case
        if (n == 0) {
            System.out.println("Number of digits = 1");
            return;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits = " + count);
    }
}