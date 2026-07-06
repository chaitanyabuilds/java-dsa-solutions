public class Palindrome {

    public static void main(String[] args) {

        int n = 12321;
        int temp = n;
        int reverse = 0;

        while (temp > 0) {

            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }

        if (reverse == n) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}