package thirdLesson;

public class Vacancy implements MutableViewable {
  private int viewsCount = 0;
  private VacancyContent content;
  private boolean isFavorite;

  public Vacancy(VacancyContent content) {
    this.content = content;
  }

  @Override
  public void incrementViewsCount() {
    viewsCount++;
  }

  @Override
  public int getViewsCount() {
    return viewsCount;
  }

  public boolean changeFavoriteState() {
    isFavorite = !isFavorite;
    return isFavorite;
  }
}
