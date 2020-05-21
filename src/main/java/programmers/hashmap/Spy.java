package programmers.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Spy {

  class Solution {
    public int solution(String[][] clothes) {
      int answer = 1;

      Map<String, Integer> dressCountByCategoryMap = new HashMap<>();

      for (String[] c: clothes) {
        String category = c[1];

        int dressCount = dressCountByCategoryMap.getOrDefault(category, 1);
        dressCountByCategoryMap.put(category, dressCount + 1);
      }

      Set<String> categories = dressCountByCategoryMap.keySet();
      for (String category: categories) {
        answer *= dressCountByCategoryMap.get(category);
      }

      return answer - 1;
    }
  }
}
