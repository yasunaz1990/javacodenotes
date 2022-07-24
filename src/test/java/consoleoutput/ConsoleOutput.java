package consoleoutput;

public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.println("hello alphaleaf");
        sleep(10);
        System.out.println("surprise");
    }

    public static void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        }catch (InterruptedException e) {

        }
    }
}
