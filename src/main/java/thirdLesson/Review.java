package thirdLesson;

public class Review {

  private final String title;
  private final String description;
  private final int rating;

  public Review(String title, String description, int rating) throws RuntimeException {
    if (rating < MIN_RATING || rating > MAX_RATING) {
      throw new RuntimeException();
    }
    this.description = description;
    this.title = title;
    this.rating = rating;
  }

  private static final int MIN_RATING = 0;

  private static final int MAX_RATING = 5;

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public int getRating() {
    return rating;
  }
}
