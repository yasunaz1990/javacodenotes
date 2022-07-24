package variable;

import org.testng.annotations.Test;

public class variablePracticeTest {


   @Test
    public void practiceOne() {
       System.out.println("hello");

  String name = "John Miller";
  int age =32;
  String username = "John.Miller";
  String password = "StrongPass 123!";
  boolean isOnline = true;
  int numOfFollowers = 1230;
  int numOfFollowings = 245;
  double likeScoreAvg = 13.4;

  // User profile info output
       System.out.println("Name:\t" + name);
       System.out.println("age:\t" + age);
       System.out.println("Current username:\t" + username);
       System.out.println("Current password:\t" + password);
       System.out.println("Current Online:\t" + isOnline);
       System.out.println("Number of followers:\t" + numOfFollowers);
       System.out.println("Number of followings:\t" + numOfFollowings);

       // Simulation of stage change
       age = 36;
       username = "johnm134";
       password = "amd23Pass123!";
       isOnline = false;
        numOfFollowers = 3230;
       int numberofFollowings = 1245;
       likeScoreAvg =23.4;

       // User profile info output
       System.out.println("Name:\t" + name);
       System.out.println("age:\t" + age);
       System.out.println("Current username:\t" + username);
       System.out.println("Current password:\t" + password);
       System.out.println("Current Online:\t" + isOnline);
       System.out.println("Number of followers:\t" + numOfFollowers);
       System.out.println("Number of followings:\t" + numOfFollowings);






   }

   @Test
    public void practiceTwo(){
       String siteUrl = "https://trello.com";
       String expectedBanner = "Trello helps team move work forward.";
       String loginButtonText = "Log in";
       String fakeUserEmail = "fake@gmail.l.com";
       String fakeUserPass = "FakePass123!";
       boolean expectedErrorDisplay = true;

   }
}
