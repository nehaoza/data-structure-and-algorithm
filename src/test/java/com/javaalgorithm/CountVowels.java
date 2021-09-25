package com.javaalgorithm;

public class CountVowels {
  public static void main(String[] args) {
    int totalVowels = countVowels("neha");
    System.out.println("Total vowels  " + totalVowels);
  }

  public static int countVowels(String input) {
    int count = 0;
    if (input == null) {
      throw new IllegalArgumentException("Input can not be null");
    }
    if (input.isEmpty()) {
      throw new IllegalArgumentException("Input can not be empty");
    }

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
        count++;
      }
    }
    return count;
  }
}