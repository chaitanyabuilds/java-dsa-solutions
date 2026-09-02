public class ReverseAnArray {

    public static void reveserArray(int[] numbers){
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {

            // Swap first and last
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};

        // Print original array
        System.out.print("Before: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Reverse the array
        reveserArray(numbers);

        // Print reversed array
        System.out.print("After: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
