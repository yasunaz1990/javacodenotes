package consoleoutput;


public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.print("10\r");
        ConsoleOutput.sleep(1);
        System.out.print("20\r");
        ConsoleOutput.sleep(1);
        System.out.print("30");
        ConsoleOutput.sleep(1);
        System.out.print("40");
        ConsoleOutput.sleep(1);
        System.out.print("50");
        ConsoleOutput.sleep(1);

    }
    public static void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {


        }
    }
    }


