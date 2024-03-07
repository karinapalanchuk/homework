package thirdLesson;

import java.util.*;

public abstract class VacancyContent {

  private final String title;
  private final List<Review> reviews = new ArrayList<>();

  protected VacancyContent(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public Collection<Review> getReviews() {
    return reviews;
  }

  public void addReview(Review review) {
    this.reviews.add(review);
  }

  public List<Review> getTopReviews(int minRating, int maxAmount) {
    reviews.sort((o1, o2) -> Integer.compare(o2.getRating(), o1.getRating()));
    List<Review> topReviews = new ArrayList<>();

    int index = 0;

    while (topReviews.size() != maxAmount || index <= (reviews.size() - 1)) {
      Review review = reviews.get(index);

      if (review.getRating() >= minRating) {
        topReviews.add(review);
      }

      index++;
    }

    return topReviews;
  }
}
