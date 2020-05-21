package codility.GenomicRangeQuery;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public int[] solution(String S, int[] P, int[] Q) {
    int size = 0;

    if (P.length < Q.length) {
      size = P.length;
    } else {
      size = Q.length;
    }

    int[] result = new int[size];

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < S.length(); i++) {
      list.add(charToInt(S.charAt(i)));
    }

    // a: 1, c:2, g: 3, t:4
    for (int k = 0; k < size; k++) {
      int min = 5;
      List<Integer> integerList = list.subList(P[k], Q[k] + 1);
      Set<Integer> set = new HashSet<>(integerList);

      for (Integer c: set) {
        if (min > c) {
          min = c;
        }
      }

      result[k] = min;

    }
    return result;
  }

  private int charToInt(char s) {
    int value;

    switch (s) {
      case 'A':
        value = 1;
        break;
      case 'C':
        value = 2;
        break;
      case 'G':
        value = 3;
        break;
      default:
        value = 4;
        break;
    }

    return value;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] P = {2, 5, 0};
    int[] Q = {4, 5, 6};

    solution.solution("CAGCCTA", P, Q);
  }

}
