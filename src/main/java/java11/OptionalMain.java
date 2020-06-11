package java11;

import java.util.Optional;

public class OptionalMain {

  static Optional<String> returnNullOptional() {
    return Optional.ofNullable(null);
  }

  static Optional<String> returnNotEmptyOptional() {
    return Optional.ofNullable("notEmpty");
  }
}
