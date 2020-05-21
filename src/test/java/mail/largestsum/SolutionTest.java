package mail.largestsum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(value = ReplaceUnderscores.class)
class SolutionTest {

  @Test
  void check1() {
    int[] input = {-1, 3, -1, 5};
    int sum = Solution.check(input);
    Assertions.assertThat(sum).isEqualTo(7);
  }

  @Test
  void check2() {
    int[] input = {-5, -3, -1};
    int sum = Solution.check(input);
    Assertions.assertThat(sum).isEqualTo(-1);
  }

  @Test
  void check3() {
    int[] input = {2, 4, -2, -3, 8};
    int sum = Solution.check(input);
    Assertions.assertThat(sum).isEqualTo(9);
  }

  @Test
  void check4() {
    int[] input = {2, -1, 4, 8, -9};
    int sum = Solution.check(input);
    Assertions.assertThat(sum).isEqualTo(13);
  }

  @Test
  void check5() {
    int[] input = {2, -1, -9, 4, 8};
    int sum = Solution.check(input);
    Assertions.assertThat(sum).isEqualTo(12);
  }

  @Test
  void check6() {
    int[] input = {2, -1, 4, -9, 8};
    int sum = Solution.check(input);
    Assertions.assertThat(sum).isEqualTo(8);
  }

  @Test
  void check7() {
    int[] input = {-1, 4, -2, 5, -1};
    int sum = Solution.check(input);
    Assertions.assertThat(sum).isEqualTo(7);
  }


}