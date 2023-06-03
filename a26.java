import java.util.Scanner;

public class a26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        int row = sc.nextInt();
        int i, space, j, num;
        for (i = 0; i < row; i++) {
            for (space = row; space > i; space--) {
                System.out.print(" ");
            }
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    }
}
