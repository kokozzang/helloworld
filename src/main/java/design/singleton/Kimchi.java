package design.singleton;

public class Kimchi {

  private Kimchi() {}

  private static class KimchiHoler {
    private static final Kimchi kimchi = new Kimchi();
  }

  public static Kimchi getInstance() {
    return KimchiHoler.kimchi;
  }

}
