package design.singleton;

public class Main {
  public static void main(String[] args) {
    Kimchi kimchi = Kimchi.getInstance();
    System.out.println(kimchi);
  }
}
