package com.interview.topdigits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class AppShouldTest {

  /**
   * Given the list of sequences of digits - See `input` var example.
   * You must find the top N digits by it's frequency of appearance in the list.
   * See below `expected` var for the example of output.
   * */
  @Test
  void find_top_N_digits_by_frequency() {

    final var input = List.of(1,1,1,2,2,3,3,3,3,3,4,4,4,4);
    final var topN = 2;
    final var expected = List.of(3, 4);

    var result = new Solution().topDigits(input, topN);

    assertThat(result, is(equalTo(expected)));
  }
}