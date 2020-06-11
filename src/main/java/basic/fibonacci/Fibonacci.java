package basic.fibonacci;

public class Fibonacci {

  public static void main(String[] args) {
    // 1,1,2,3,5,8,13,21,34,55,89,144,233

    System.out.println("fibo1 = " + fibo1(8));
    System.out.println("fibo2 = " + fibo2(8));

  }

  private static int fibo1(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    }

    return fibo1(n - 1) + fibo1(n - 2);
  }


  private static int[] fiboArray = new int[9];

  private static int fibo2(int n) {

    int returnValue = 0;

    if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    } else if (fiboArray[n] == 0) {
      returnValue = fibo1(n - 1) + fibo1(n - 2);
      fiboArray[n] = returnValue;
    } else {
      returnValue = fiboArray[n];
    }

    return returnValue;
  }

}
