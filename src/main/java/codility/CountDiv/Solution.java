package codility.CountDiv;

public class Solution {
  public int solution(int A, int B, int K) {
    int result = 0;
    if (A == 0) {
      result = B / K + 1;
    } else {
      result = B / K - (A - 1) / K;
    }


    return result;
  }



}
