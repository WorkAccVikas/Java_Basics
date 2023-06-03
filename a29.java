// decimal to binary

public class a29 {
    public static void main(String[] args) {
        int decimalNumber = 10;

        int[] a = new int[50];
        int index = 0;
        while (decimalNumber > 0) {
            a[index++] = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
    
}
