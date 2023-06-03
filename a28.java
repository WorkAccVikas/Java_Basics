public class a28 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 15 };
        int maxOne = 0;
        int maxTwo = 0;

        for (int n : arr) {
            System.out.println("Iteration = " + n);
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
                System.out.println("First if = " + maxTwo + " " + maxOne);
            } else if (maxTwo < n) {
                maxTwo = n;
                System.out.println("second if = " + maxTwo);
            }
        }
        System.out.println("Largest = " + maxOne);
        System.out.println("Second Largest = " + maxTwo);
    }

}
