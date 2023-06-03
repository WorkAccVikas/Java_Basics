// prime no upto n numbers
import java.util.Scanner;

public class a25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto no");
        int no = sc.nextInt();
        int count = 0;
        for (int n = 2; n <= no; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(n + "is prime number");
                count++;
            }
        }
        System.out.println("Total Prime numbers count = "+count);
    }
    
}
