package thirdLesson;

public class VacancyImageContent extends VacancyContent{
  private final String imageUrl;

  protected VacancyImageContent(String title, String imageUrl) {
    super(title);
    this.imageUrl = imageUrl;
  }

  public String getImageUrl() {
    return imageUrl;
  }
}
