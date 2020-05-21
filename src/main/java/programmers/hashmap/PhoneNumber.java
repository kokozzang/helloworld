package programmers.hashmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber {

  public static void main(String[] args) {
    String[] phone_book = {"119", "97674223", "1195524421"};

    Solution solution = new Solution();

    boolean result = solution.solution(phone_book);

  }

  static class Solution {
    public boolean solution(String[] phone_book) {
      boolean answer = true;

      Map<Integer, List<String>> phoneNumberListByLengthMap = new HashMap<>();
      int maxLength = 0;

      for (String phoneNumber: phone_book) {
        Integer length = phoneNumber.length();
        if (length > maxLength) {
          maxLength = length;
        }

        List<String> phoneNumberList = phoneNumberListByLengthMap.getOrDefault(length, new ArrayList<String>());
        phoneNumberList.add(phoneNumber);
        phoneNumberListByLengthMap.put(length, phoneNumberList);
      }

      for (int i = 1; i < maxLength; i++) {
        List<String> prefixes = phoneNumberListByLengthMap.get(i);
        if (prefixes != null) {
          for (int j = i + 1; j <= maxLength; j++) {
            List<String> dests = phoneNumberListByLengthMap.get(j);

            if (dests != null) {
              for (String prefix: prefixes) {
                for (String dest: dests) {
                  if (dest.startsWith(prefix)) {
                    answer = false;
                  }
                }
              }
            }

          }
        }

      }


      return answer;
    }
  }
}
