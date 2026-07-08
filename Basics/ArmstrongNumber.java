public class ArmstrongNumber {

    public static void main(String[] args) {

        int n = 153;

        int temp = n;
        int count = 0;
        int sum = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = n;

        while (temp > 0) {

            int lastDigit = temp % 10;

            sum = sum + (int) Math.pow(lastDigit, count);// Remember this

            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}