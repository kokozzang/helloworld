package programmers.stackqueue.p_tower;

import java.util.Arrays;
import java.util.Stack;

public class Tower {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] heights = {6, 9, 5, 7, 4};
    System.out.println(Arrays.toString(solution.solution(heights)));
  }
}

class Solution {
  public int[] solution(int[] heights) {


    Stack<Integer> answerStack = new Stack<>();

    for (int source = heights.length - 1; source > 0; source--) {
      for (int target = source - 1; target >= 0; target--) {
        if (heights[source] < heights[target]) {
          answerStack.push(target);
          break;
        }
        else {
          if (target == 0) {
            answerStack.push(-1);
          }
        }
      }
    }
    answerStack.push(-1);


    int[] answer = new int[answerStack.size()];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = answerStack.pop() + 1;
    }

    return answer;
  }
}
