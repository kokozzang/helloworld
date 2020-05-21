package codility.MinAvgTwoSlice;

// you can also use imports, for example:

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
  public int solution(int[] A) {
    // write your code in Java SE 8
    int result = 0;

    Map<Float, List<Integer>> indexesByAvg = new HashMap<>();

    Float minAvg = null;

    for (int start = 0; start < A.length - 1; start++) {
      int sum = A[start];

      for (int end = start + 1; end < A.length; end++) {
        int gg = start;

        sum += A[end];
        float avg = ((float) sum) / ((end - start) + 1);

        if (minAvg == null) {
          minAvg = avg;
        } else if (minAvg > avg) {
          minAvg = avg;
        }

        List<Integer> indexes = new ArrayList<>();
        indexesByAvg.computeIfAbsent(avg, (key) -> {
          indexes.add(gg);
          return indexes;
        });

        indexesByAvg.computeIfPresent(avg, (key, value) -> {
          value.add(gg);
          return value;
        });
      }
    }

    List<Integer> indexes = indexesByAvg.get(minAvg);
//    indexes = indexes.stream().sorted().collect(Collectors.toList());

    result = indexes.get(0);


    return result;
  }
}
