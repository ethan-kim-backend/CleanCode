public class Main {
    public static void main(String[] args) {
        try{
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            System.out.println("directory = " + directory);
            System.out.println("port = " + port);
            System.out.println("logging = " + logging);
            // executeApplication(logging, port, directory);
        }catch (ArgsException e ){
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }
}
