package Variable;

import org.testng.annotations.Test;

public class VariablePracticeTest {
    @Test
    public void practiceOne() {

        //System.out.println("hello");
        String name = "John Miller";
        int age = 32;
        String username = "John.miller";
        String password = "StrongPass123!";
        boolean isOnline = true;
        int numFollowers = 2230;
        int numFollowing =245;
        double likeAvg = 13.4;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Currently Online: " + isOnline);
        System.out.println("Number of Followers: " + numFollowers);
        System.out.println("Number Following: " + numFollowing);
        System.out.println("Like Score Average: " + likeAvg);

        age = 36;
        username = "johnm1234";
        password = "amd23Pass123";
        isOnline = false;
        numFollowers = 3230;
        numFollowing = 1245;
        likeAvg = 23.4;

        System.out.println("\n\n");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Currently Online: " + isOnline);
        System.out.println("Number of Followers: " + numFollowers);
        System.out.println("Number Following: " + numFollowing);
        System.out.println("Like Score Average: " + likeAvg);


    }

    @Test
    public void practiceTwo() {
        String siteUrl = "https://trello.com";
        String expectedBanner = "Trello helps teams move work forward.";
        String login = "Log in";
        String fakeUsername = "fake@gmail.com";
        String fakePassword = "FakePass123";
        boolean expectedErrorDisplay = true;

    }

}
