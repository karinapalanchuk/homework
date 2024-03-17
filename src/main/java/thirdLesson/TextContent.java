package thirdLesson;

public class TextContent extends Content {
  private final String description;

  protected TextContent(String title, String description) {
    super(title);
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
