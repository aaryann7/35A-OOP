public class JavaArgument {
    public static void main(String[] args) {
        if (args.length < 2) { 
            System.out.println("Provide args");
            return;

        }

        System.out.println("Firstargs" + args[0]);
        System.out.println("Secondargs" + args[1]);
        int parsedValue = Integer.parseInt(args[1]);
        

    }
    
}
