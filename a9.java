public class a9 {
    public static void main(String[] args) {
        int[] arrayOne = { 21, 57, 11, 37, 24 };

        int[] arrayTwo = { 21, 57, 11, 37, 24 };

        boolean equalOrNot = true;

        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }
        

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
