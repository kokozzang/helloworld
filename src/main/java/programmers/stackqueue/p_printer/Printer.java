package programmers.stackqueue.p_printer;

class Solution {
  private static int last = 0;


  public int solution(int[] priorities, int location) {

    int answer = 0;
    boolean isLocationPrinted = false;
    last = priorities.length - 1;

    for (int i = 0; i <=last; i++) {
      boolean canPrint = false;

      for (int j = i + 1; j <= last; j++) {
        int val = deQueue(priorities);
        if (val >= priorities[j]) {
          canPrint = true;
        } else {
          canPrint = false;
          enQueue(priorities, val);
          location--;
          break;
        }


      }
      if (canPrint) {
        answer++;
        if (location == i) {
          isLocationPrinted = true;
          break;
        }
      } else {
        if (location < 0) {
          location = last - 1;
        }
      }
    }

    if (last > 0 && !isLocationPrinted) {
      answer = location + 1;
    }

    return answer;
  }

  private int deQueue(int[] priorities) {
    int value = priorities[0];
    moving(priorities);
    last--;
    return value;
  }

  private void enQueue(int[] priorities, int value) {
    priorities[last] = value;
    last++;
  }

  private void moving(int[] priorities) {
    for (int i = 0; i <= last -1; i++) {
      priorities[i] = priorities[i+1];
    }
  }
}

class Main {
  public static void main(String[] args){
    int[] properties = {2, 1, 3, 2};
    int location  = 2;

    int[] properties2 = {1, 1, 9, 1, 1, 1};
    int location2  = 0;

    int[] properties3 = {2, 1, 3, 2};
    int location3  = 0;
    // (2)132
    // 132(2)
    // 32(2)1
    // 2(2)1

    Solution solution = new Solution();

    int answer = solution.solution(properties, location);
    int answer2 = solution.solution(properties2, location2);
    int answer3 = solution.solution(properties3, location3);
    System.out.println(answer);
    System.out.println(answer2);
    System.out.println(answer3);
  }
}