package com.junittestcases;

import com.javaalgorithm.CountVowels;
import org.junit.Assert;
import org.junit.Test;

public class CountVowelsTest {
  @Test
  public void findTotalVowels_positiveCondition() {
    int totalVowels = CountVowels.countVowels("neha");
    Assert.assertEquals(2, totalVowels);
  }

  @Test(expected = IllegalArgumentException.class)
  public void findTotalVowelsByPassingNullValue() {
    CountVowels.countVowels(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void findTotalVowelsByPassingEmptyValue() {
    CountVowels.countVowels("");
  }
}