class Solution {
  public int romanToInt(String s) {
      int result = 0;       // Initialize the result to 0
      char previousChar = 'Z'; // Initialize the previous character to an arbitrary value ('Z' in this case)
      for (int i = s.length() - 1; i >= 0; i--) { // Loop through the Roman numeral string from right to left
          char numeral = s.charAt(i); // Get the current character
          switch(numeral) {
              case 'I' -> {
                  if (previousChar == 'V' || previousChar == 'X') {
                      result -= 1; // If 'I' is before 'V' or 'X', subtract 1; otherwise, add 1
                  }else {
                      result += 1; // Otherwise, simply add 1
                  }
              }
              case 'V' -> result += 5; // 'V' represents 5, so add 5 to the result
              case 'X' -> {
                  if (previousChar == 'L' || previousChar == 'C') {
                      result -= 10; // If 'X' is before 'L' or 'C', subtract 10; otherwise, add 10
                  }else {
                      result += 10; // Otherwise, simply add 10
                  }
              }
              case 'L' -> result += 50; // 'L' represents 50, so add 50 to the result
              case 'C' -> {
                  if (previousChar == 'D' || previousChar == 'M') {
                      result -= 100; // If 'C' is before 'D' or 'M', subtract 100; otherwise, add 100
                  }else {
                      result += 100; // Otherwise, simply add 100
                  }
              }
              case 'D' -> result += 500; // 'D' represents 500, so add 500 to the result
              case 'M' -> result += 1000; // 'M' represents 1000, so add 1000 to the result
          }
          previousChar = numeral; // Update the previous character for the next iteration
      }
      return result; // Return the final result
  }
}
