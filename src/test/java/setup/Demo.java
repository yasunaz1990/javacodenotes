package setup;

public class Demo {

    // Method 1
    public static void main(String[] args) {
        System.out.println("Hello");
        sleep(1);
        System.out.println("student!");
    }


    // Method 2
    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException ignore) {
            // Ignore
        }
    }//end
}