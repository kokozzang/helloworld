package java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OptionalTest {

  @Test
  void alwaysEmptyStringsTest() {
    boolean isEmpty = OptionalMain.returnNullOptional().isEmpty();
    Assertions.assertTrue(isEmpty);
  }

  @Test
  void alwaysNotEmptyStringsTest() {
    boolean isEmpty = OptionalMain.returnNotEmptyOptional().isEmpty();

    String value = OptionalMain.returnNotEmptyOptional();

    Assertions.assertFalse(isEmpty);
    System.out.println(OptionalMain.returnNotEmptyOptional().get());
  }

  @Test
  void alwaysEmptyStrings_orElse_Test() {
    String ggg = OptionalMain.returnNullOptional()
        .orElse("ggg");
    Assertions.assertTrue(isEmpty);
  }

}
