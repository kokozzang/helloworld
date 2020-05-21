package design.singleton;

public class Kimchi {

  private Kimchi() {

  }

  public static Kimchi getInstance() {
    Kimchi kimchi = new Kimchi();
    return kimchi;
  }
}
