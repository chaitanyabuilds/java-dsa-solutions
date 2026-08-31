    public class SolidRhombus {

        public static void solid_rhombus(int n) {

            // Outer loop controls the rows
            for (int i = 1; i <= n; i++) {

                // Print spaces
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }

        public static void main(String[] args) {
            solid_rhombus(5);
        }
    }

    // *****
    // *****
    // *****
    // *****
    // *****