public class ButterflyPattern {

    public static void butterfly(int n) {

        // FIRST HALF (Upper Half)
        for (int i = 1; i <= n; i++) {

            // 1. Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2. Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 3. Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // SECOND HALF (Lower Half)
        for (int i = n; i >= 1; i--) {

            // 1. Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2. Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 3. Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(4);
    }
}


// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *