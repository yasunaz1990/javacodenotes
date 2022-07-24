package variable;

public class OCAExamActivity {
    public static void main(String []args){
        int myVar;
        //System.out.println(myVar);         // A error

        myVar = 50;                         // B 50
        System.out.println(myVar);

        int anotherVar= 100;                // C 100
        System.out.println(anotherVar);

        myVar = anotherVar;
        System.out.println(myVar);          // D 100

        anotherVar = 200;
        System.out.println(anotherVar);     // E 200
        System.out.println(myVar);          // F 100

    }
}
