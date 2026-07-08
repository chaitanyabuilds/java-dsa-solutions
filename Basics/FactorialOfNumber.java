import java.util.*;
public class FactorialOfNumber{
    public static void main(String[] args){
        int n = 4;

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}