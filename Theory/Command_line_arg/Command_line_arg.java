package Theory.Command_line_arg;

public class Command_line_arg {

    public static void main(String[] args) {
System.out.println("Your first argument is: "+args[0]);  

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
    }

}
