package variable;

import org.testng.annotations.Test;

import javax.swing.*;

public class VariablePracticeTest {

    @Test

    public void practiceOne() {
        System.out.println("Hello.");
        String name = "John Miller";
        int age = 32;
        String username = "john.miller";
        String password = "StrongPass123!";
        boolean isOnline = true;
        int numOfFollowers = 1230;
        int numOfFollowing = 245;
        double likeScoresAverage = 13.4;

        showprofile(name, age, username, password, isOnline, numOfFollowers, numOfFollowing, likeScoresAverage);

        System.out.println("\n");
        // Simulation of state change
        age = 36;
        username = "johnm134";
        password = "amd23Pass123!";
        isOnline = false;
        numOfFollowers = 3230;
        numOfFollowing = 1245;
        likeScoresAverage = 23.4;

        showprofile(name, age, username, password, isOnline, numOfFollowers, numOfFollowing, likeScoresAverage);
    }

    public void showprofile(String name, int age, String username, String password, boolean isOnline, int numOfFollowers, int numOfFollowing, double likeScoresAverage) {
        // User profile info output
        String answer = "No";
        if (isOnline) {
            answer = "Yes";
        }

        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current Username:\t" + username);
        System.out.println("Current Password:\t" + password);
        System.out.println("Currently Online:\t" + answer);
        System.out.println("Number of followers:\t" + numOfFollowers);
        System.out.println("Number of following:\t" + numOfFollowing);
        System.out.println("Like scores average:\t" + likeScoresAverage);
    }

    public void practiceTwo() {

        // Create variables to be used in the Trello test

        String siteUrl = "https://trello.com";
        String expectedMessage = "Trello helps teams move work forward.";
        String loginButtonText = "Log in";
        String fakeUserEmail = "fake@gmai.l.com";
        String fakeUserPassword = "FakePass123!";
        String expectedErrorMessage = "There isn't an account for this email";
        boolean expectedErrorDisplay = true;

        // Test Step (User usage simulation)

        // Assertion (Comparison)


    }
}
