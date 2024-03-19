package thirdLesson;

public class ImageContent extends Content {
  private final String imageUrl;

  protected ImageContent(String title, String imageUrl) {
    super(title);
    this.imageUrl = imageUrl;
  }

  public String getImageUrl() {
    return imageUrl;
  }
}
