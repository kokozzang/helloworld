package mail.encrypted;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SolutionTest {


  @Test
  void EGG_FOO() {
    String str1 = "EGG";
    String str2 = "FOO";
    Assertions.assertTrue(Solution.checker(str1, str2));
  }

  @Test
  void ABBCD_APPLE() {
    String str1 = "ABBCD";
    String str2 = "APPLE";
    Assertions.assertTrue(Solution.checker(str1, str2));
  }

  @Test
  void AAB_FOO() {
    String str1 = "AAB";
    String str2 = "FOO";
    Assertions.assertFalse(Solution.checker(str1, str2));
  }


  @Test
  void map() {
    Map<String, String> map = new HashMap<>();
    map.put("aaa", "123");
    map.put("sdf", "123");
    map.put("dh", "123");
    map.put("a", "123");
    System.out.println(map.toString());
  }
}