package thirdLesson;

public class Vacancy<T extends Content> implements MutableViewable, WithContent<T> {
  private int viewsCount = 0;
  private final T content;
  private boolean isFavorite;

  public Vacancy(T content) {
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

  @Override
  public T getContent() {
    return content;
  }
}
