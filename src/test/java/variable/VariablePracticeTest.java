package variable;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class VariablePracticeTest {

    @Test
    public void practiceOne() {
        String name = "John Miller";
        int    age  = 32;
        String username = "john.miller";
        String password = "StrongPass123!";
        boolean isOnline = true;
        int numOfFollowers = 1230;
        int numberOfFollowing = 245;
        double likeScoreAvg = 13.4;

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Currently Online:\t" + isOnline );
        System.out.println("Number of followers:\t" + numOfFollowers);
        System.out.println("Number of following:\t" + numberOfFollowing);
        System.out.println("Like Score Avg:\t" + likeScoreAvg);

        // Simulation of state change
        age = 36;
        username = "johnm134";
        password = "amd23Pass123!";
        isOnline = false;
        numOfFollowers = 3230;
        numberOfFollowing = 1245;
        likeScoreAvg = 23.4;


        System.out.println("\n\n");

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current username:\t" + username);
        System.out.println("Current password:\t" + password);
        System.out.println("Currently Online:\t" + isOnline );
        System.out.println("Number of followers:\t" + numOfFollowers);
        System.out.println("Number of following:\t" + numberOfFollowing);
        System.out.println("Like Score Avg:\t" + likeScoreAvg);




    }

    @Test
    public void practicetwo() {
        String siteUrl = "https://trello.com";
        String expectedBanner = "Trello helps teams move work forward.";
        String loginButtonText = "Log in";
        String fakeUserEmail = "fake@gmail.com";
        String fakeUserPass = "FakePass123!";
        boolean expectedErrorDisplay = true;

        // ---- Test Step ( User usage simulation )



        // ---- Assertion
    }
}
