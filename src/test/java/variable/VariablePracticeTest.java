package variable;

import org.testng.annotations.Test;

public class VariablePracticeTest {

    //Data Type   Type of data
    //----------
    // [Date Type [varname] = [data];
    // String    text data
    // boolean   logical number
    // int       whole number
    // double    Decimal number
    // char      letter



    @Test
    public void practiceOne() {
        String name = "John Miller";
        int    age = 32;
        String username = "John Miller";
        String password = "StrongPass123!";
        boolean isOnline = true;
        int numOfFollowers = 1230;
        int numberOfFollowings = 245;
        double likeScoreAve = 13.4;

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Current Online:\t" + isOnline);
        System.out.println("Number of followers:\t" + numOfFollowers);
        System.out.println("Number of followings:\t" + numberOfFollowings);
        System.out.println("Like scores average:\t" + likeScoreAve);

        // Simulation of state change
        age = 36;
        username = "johnm134";
        password = "amd23Pass123!";
        isOnline = false;

        numOfFollowers = 3230;
        numberOfFollowings = 1245;
        likeScoreAve = 23.4;


        System.out.println("\n\n");

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Current Online:\t" + isOnline);
        System.out.println("Number of followers:\t" + numOfFollowers);
        System.out.println("Number of followings:\t" + numberOfFollowings);
        System.out.println("Like scores average:\t" + likeScoreAve);

    }

    @Test
    public void practiceTwo() {
        String siteUrl = "https://trello.com";
        String expectedBanner = "Trello helps teams move work forward";
        String loginButtonText = "Log in";
        String fakeUserEmail = "fake@gmai.l.com";
        String fakeUserPass = "FakePass123!";
        Boolean expectedEroorDisplay = true;


    }




}
