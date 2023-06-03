public class a23 {

    public static void main(String[] args) {
        String str = "Vikas Kailas Chandlekar";

        String[] s = str.split(" ");

        String smallest = s[0];
        String largest = "";

        for (String s1 : s) {
            if (s1.length() < smallest.length()) {
                smallest = s1;
            } else if (s1.length() > largest.length()) {
                largest = s1;
            }
        }

        System.out.println("\nSmallest = "+smallest+"\nLargest = "+largest);
    }
}
