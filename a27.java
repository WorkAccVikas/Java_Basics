public class a27 {
    public static void main(String[] args) {
        String s1 = "Vikas";
        System.out.println("Hi = " + s1.charAt(0));
        System.out.println("length = " + s1.length());
        System.out.println("substrin = " + s1.substring(0, 4));
        char[] c = s1.toCharArray();
        int count = 0;
        for (char d : c) {
            count++;
        }
        System.out.println("legth = " + count);
        String s2 = "Vikas123";
        s2 = s2.replaceAll("\\D", "");
        System.out.println("Replace after = " + s2);
        int sum = 0;
        char[] c1 = s2.toCharArray();
        for (char d1 : c1) {
            System.out.println(d1);
            sum = sum + Character.getNumericValue(d1);
            System.out.println("Sum = "+sum);
        }
        System.out.println("Sum = " + sum);

        String s3 = "Java";
        String s4 = "Jbva";
        int val = s3.compareTo(s4);
        System.out.println(val);
    }
}
