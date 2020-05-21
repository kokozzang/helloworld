package basic.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.putIfAbsent("1", 1);
  }
}
