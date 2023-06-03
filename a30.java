import java.time.LocalDate;
import java.time.LocalTime;

public class a30 {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime d1 = LocalTime.now();
        System.out.println("Hi \t" + d);
        System.out.println("Hi \t" + d1);

        String s1 = "123";
        Integer i11 = Integer.valueOf(s1);
        System.out.println("Hi \t" + i11);

        int i21 = 100;
        String s2 = Integer.toString(i21);
        System.out.println("Hi \t" + s2);

        String s = "h";
        String s11 = "a";
        System.out.println(s.compareTo(s11));

        int sum = 0;
        String s12 = "VIkas123AAA45";
        s12 = s12.replaceAll("\\D+", "");
        System.out.println(s12);

        char cc[] = s12.toCharArray();

        for (char cc1 : cc) {
            System.out.println(cc1);
            sum = sum + Character.getNumericValue(cc1);
        }
        System.out.println("Total = " + sum);


        int x=10;
        System.out.println("x = "+ x++);
        System.out.println("x = "+ x++);
        System.out.println("x = "+ x++);
        System.out.println("x = "+ x++);
    }

}
