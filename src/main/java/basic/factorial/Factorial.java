package basic.factorial;

public class Factorial {


  public static void main(String[] args) {
    int n = 4;

    System.out.println("n = " + factorial(n));
  }

  private static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

}
