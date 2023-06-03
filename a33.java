import java.util.Arrays;
import java.util.Scanner;

public class a33 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements");
        int n=sc.nextInt();

        int a[]=new int[n];
        int i,j,temp;
        System.out.println("Enter elements : ");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        j=i-1;
        i=0;

        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

        System.out.println("Reverse :");
        for(int k:a){
            System.out.println(k);
        }
    }
    
}
