import java.util.Arrays;

public class a11 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 0, 30, 0, 0, 40, 0, 0 };

        int c = 0;
        System.out.println("Before : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[c] = arr[i];
                c++;
            }
        }
        
        while (c < arr.length) {
            arr[c] = 0;
            c++;
        }
        System.out.println("After : " + Arrays.toString(arr));





        
        
        int[] inputArray = { 10, 20, 0, 30, 0, 0, 40, 0, 0 };
        System.out.println("Before : " + Arrays.toString(inputArray));

        int counter = inputArray.length - 1;

        // Traversing the inputArray from right to left

        for (int i = inputArray.length - 1; i >= 0; i--) {
            // If inputArray[i] is non-zero

            if (inputArray[i] != 0) {
                // Assigning inputArray[i] to inputArray[counter]

                inputArray[counter] = inputArray[i];

                // Decrementing the counter by 1

                counter--;
            }
        }

        // Assigning 0 to remaining elements

        while (counter >= 0) {
            inputArray[counter] = 0;

            counter--;
        }
        System.out.println("After : " + Arrays.toString(inputArray));
    }

}
