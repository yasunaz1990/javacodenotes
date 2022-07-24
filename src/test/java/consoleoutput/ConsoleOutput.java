package consoleoutput;

// Class code content starts here
public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.print("Hello Alphaleaf!\n\n\n");
        sleep(3);
        System.out.print("\n");
        System.out.println("!!! ## %%%");
        sleep(2);
        System.out.print("Let's code");
        sleep(3);
        System.out.println(" Java!!");
        System.out.println("sout");
    }

    public static void sleep(int s) {
        try{
            Thread.sleep(s * 1000);
        }catch (InterruptedException e) {

        }
    }
}
