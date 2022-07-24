package variable;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VariablePracticeTest {
    //Data Type     Type of data
    //
    //  String        text data
    //  boolean     logical label
    //  int     whole number
    //  double       decimal number
    //  char         letter
    @Test
    public void practiceOne() {
        String name = "John Miller";
        int age = 32;
        String username = "john.miller";
        String password = "StrongPass123!";
        boolean isOnline = true;
        int numOfFollowers =   1230;
        int numberOfFollowings =245;
        double likeScoreAvg = 13.4;

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Currently online:\t" + isOnline);
        System.out.println("Number of followers\t" + numOfFollowers);
        System.out.println("Number of followings:\t" + numberOfFollowings);
        System.out.println("Like score average:\t" + likeScoreAvg);

        // Simulation of state change
        age = 36;
        username = "johnm134";
        password = "amd23Pass123!";
        isOnline = false;
        numOfFollowers = 3230;
        numberOfFollowings = 1245;
        likeScoreAvg = 23.4;


        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Currently online:\t" + isOnline);
        System.out.println("Number of followers\t" + numOfFollowers);
        System.out.println("Number of followings:\t" + numberOfFollowings);
        System.out.println("Like score average:\t" + likeScoreAvg);









    }



    @Test
    public  void practiceTwo(){
       //       Test Data
        String siteUrl = "https://trello.com";
        String expectedBanner = "Trello helps teams move work forward";
        String loginButtonText = "Log in";
        String fakeUserEmail = "fake@gmai.l.com";
        String fakeUserPass = "FakePass123!";
        boolean expectedErrorDisplay = true;

        //      Test Step ( User usage
        


    }




}
