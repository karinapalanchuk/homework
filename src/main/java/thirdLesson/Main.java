package thirdLesson;

public class Main {
  public static void main(String[] args) {
    Divisible divisible = num -> num % 13 == 0;
    Discriminant discriminant = (a, b, c) -> Math.pow(b, 2) - 4 * a * c;
  }
}
