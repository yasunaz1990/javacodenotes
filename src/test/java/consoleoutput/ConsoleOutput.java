package consoleoutput;
public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.print("Hello Alphaleaf!\n");
        System.out.print("!!!##%%\n");
        System.out.print("Let's code\n");
        System.out.print(" Java!!\n");


        System.out.println("--------------------------");

        System.out.println("Hello Alphaleaf!");
        System.out.println("!!!##%%");
        System.out.println("Let's code");
        System.out.println(" Java!!");
    }

    public static void sleep(int s) {
        try {
            System.out.print("|||||");
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {
        }
    }
}
