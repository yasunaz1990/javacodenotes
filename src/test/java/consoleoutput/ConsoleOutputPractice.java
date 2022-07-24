package consoleoutput;

public class ConsoleOutputPractice {
    public static void main(String[] args) {
        System.out.println("Name Russell");
        System.out.println("Name\tRussell");
        System.out.print("10%\r");
        sleep(1);
        System.out.print("20%\r");
        sleep(1);
        System.out.print("30%\r");
        sleep(1);
        System.out.print("40%\r");
        sleep(1);
        System.out.print("50%\r");
    }
    public static void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        }catch (InterruptedException e) {

        }
    }
}
