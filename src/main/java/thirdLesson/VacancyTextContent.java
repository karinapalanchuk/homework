package thirdLesson;

public class VacancyTextContent extends VacancyContent{
  private final String description;

  protected VacancyTextContent(String title, String description) {
    super(title);
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
