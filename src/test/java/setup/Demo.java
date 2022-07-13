package setup;


public class Demo {


    private static final String message = "Hello";
    private static final String audience = "Student!";


    public static void main(String[] args) {
        System.out.println(message);
        sleep(1);
        System.out.println(audience);
    }


    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException ignore) {
            // Ignore
        }
    }

}//end::class


