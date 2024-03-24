package thirdLesson;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Divisible divisible = num -> num % 13 == 0;
    Discriminant discriminant = (a, b, c) -> Math.pow(b, 2) - 4 * a * c;

    List<Vacancy> vacancyList = new ArrayList<>();
    System.out.println(favoriteVacancy(vacancyList));
    System.out.println(getTopViewable(vacancyList, 100));
  }

  public static List<Vacancy> favoriteVacancy(List<Vacancy> vacancy) {
    return vacancy.stream().filter(Vacancy::getIsFavorite).toList();
  }

  public static List<? extends Viewable> getTopViewable(List<? extends Viewable> vacancies, int countView) {
    return vacancies.stream().filter(vacancy -> vacancy.getViewsCount() >= countView).toList();
  }
}
