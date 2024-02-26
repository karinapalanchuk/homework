package org.example.SecondLesson;

public class Task2 {

  public static int sumNum(int[] num, int currentIndex) {
    if (currentIndex >= num.length) {
      return 0;
    }
    return num[currentIndex] + sumNum(num, currentIndex + 1);
  }
}
