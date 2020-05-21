package mail.largestsum;

public class Solution {

  public static void main(String[] args) {
    System.out.println("ss");
  }

  public static int check(int[] input) {
    int maxSum = input[0];
    int currentSum = input[0];
    for(int i = 1; i < input.length; i++) {
      currentSum = Math.max(currentSum + input[i], input[i]);
      maxSum = Math.max(currentSum, maxSum);
    }
    return maxSum;
  }

}
