package mail.encrypted;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {

  }

  public static boolean checker(String str1, String str2) {
    String str1Pattern = getPattern(str1);
    System.out.println("str1Pattern: " + str1Pattern);

    String str2Pattern = getPattern(str2);
    System.out.println("str2Pattern: " + str2Pattern);

    return str1Pattern.equals(str2Pattern);
  }

  private static String getPattern(String str) {
    Map<Character, Integer> codeByCharForStr1 = new HashMap<>();

    StringBuilder patternBuilder = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);

      Integer code = codeByCharForStr1.get(currentChar);
      if (code == null) {
        code = codeByCharForStr1.size();
        codeByCharForStr1.put(currentChar, code);
      }
      patternBuilder.append(code);
    }



    return patternBuilder.toString();
  }


}
