package homework.h07;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class T1 {
  public List<String> fizzBuzz(int number) {
    List<String> answer = new ArrayList<>(number);
    for (int i = 1; i <= number; i++) {
      if (i % 15 == 0) {
        answer.add("FizzBuzz");
      } else if (i % 3 == 0) {
        answer.add("Fizz");
      } else if (i % 5 == 0) {
        answer.add("Buzz");
      } else {
        answer.add(String.valueOf(i));
      }
    }
    return answer;
  }
}
