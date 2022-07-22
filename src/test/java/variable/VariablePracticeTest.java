package variable;

import org.testng.annotations.Test;

public class VariablePracticeTest {

    @Test
    public void practiceOne() {
        String name = "John Miller";
        int age = 32;
        String username = "john.miller";
        String password = "StrongPass123!";
        boolean isOnline = true;
        int numbOfFollowers = 1230;
        int numbOfFollowing = 245;
        double likeScoreAvg = 13.4;

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age: \t" + age);
        System.out.println(" Current username:\t" + username);
        System.out.println(" Current password:\t" + password );
        System.out.println("Currently Online:\t" + isOnline);
        System.out.println("Number of followers:\t" + numbOfFollowers);
        System.out.println("Number of following:\t" + numbOfFollowing);
        System.out.println("Like score average:\t" + likeScoreAvg);

        // Simulation of state change
        age = 36;
        username = "johnm134";
        password ="and23Pass123!";
        isOnline = false;
        numbOfFollowers = 3230;
        numbOfFollowing = 1245;
        likeScoreAvg = 23.4;

        System.out.println("\n\n");

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age: \t" + age);
        System.out.println(" Current username:\t" + username);
        System.out.println(" Current password:\t" + password );
        System.out.println("Currently Online:\t" + isOnline);
        System.out.println("Number of followers:\t" + numbOfFollowers);
        System.out.println("Number of following:\t" + numbOfFollowing);
        System.out.println("Like score average:\t" + likeScoreAvg);


    }


    @Test
    public void practiceTwo() {
        String sitUrl = "https://trello.com";
        String expectedBanner = "Trello helps teams move work forward";
        String loginButtonText = "Log in";
        String fakeUserEmail = "fake@gmai.l.com";
        String fakeUserPass = "FakePass123!";
        boolean expectedErrorDisplay = true;


    }
}


