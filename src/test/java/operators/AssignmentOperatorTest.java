package operators;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class AssignmentOperatorTest {

  @Test
  public void demo() {
      /*
      symbol: =
      [storage] = [data source]
      variable   value, variable, method

       */
      String username = "testProd1"; // value

      String temp = username;

      double data = Math.random();
      System.out.println(data);

  }

  @Test
    public void implicitTypeConversionEx2() {
      // String var = 'C';
      // String var = 89.02;
      // String var = true;

      // boolean var = 0;
      // boolean var = "text";

  }
  @Test
    public void explicitTypeConversionDemo() {
      int ans = (int) 19.89;
      System.out.println(ans);
  }

  @Test
    public void explicitTypeCastingUsage() {
      // generating random numbers
      // math.random()
      double ans = Math.random();   // 0.0000 ~ 0.9999999
      ans = ans * 100;
      int rand = (int)ans; // explicit type casting
      System.out.println(rand);
    // Short way to write this


  }
}

