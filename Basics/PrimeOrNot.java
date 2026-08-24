import java.util.*;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}




//optimized-approach

import java.util.*;

public class PrimeOrNot {
    public static boolean isPrime(int n) {

    if (n == 2) {
        return true;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {

        if (n % i == 0) {
            return false;
        }
    }

    return true;
}

public static void main(String[] args) {

    System.out.println(isPrime(88));
}
}
