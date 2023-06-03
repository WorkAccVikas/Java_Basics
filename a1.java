import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // define original array
        int[] intArray = new int[] { 52, 45, 32, 64, 12, 87, 78, 98, 23, 7 };
        String[] intArray1 = new String[] { "hello", "amit", "sachin", "big" };
        int temp = 0;

        // print original array
        System.out.println("Original array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        // Sort the array in ascending order using two for loops
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) { // swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        // print sorted array
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        // print original array
        System.out.println("Original array: ");
        for (int i = 0; i < intArray1.length; i++) {
            System.out.print(intArray1[i] + " ");
        }
        // Sort the array in ascending order using two for loops
        for (int i = 0; i < intArray1.length; i++) {
            for (int j = i + 1; j < intArray1.length; j++) {
                if (intArray1[i].compareTo(intArray1[j]) > 0) {
                    // swapping array elements
                    String temp1 = intArray1[i];
                    intArray1[i] = intArray1[j];
                    intArray1[j] = temp1;
                }
            }
        }

        // print sorted array
        System.out.println("\nArray sorted in ascending order: ");
        // for (int i = 0; i < intArray1.length; i++) {
        //     System.out.print(intArray1[i] + " ");
        // }
        System.out.println(Arrays.toString(intArray1));

    }
}