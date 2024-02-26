package org.example.SecondLesson;

public class Task1 {

  public static void getResume(String surname, String name, String fathersName) {
    getResume(surname, name, fathersName, null, null);
  }

  public static void getResume(String surname, String name, String fathersName, Integer age, String profession) {
    getResume(surname, name, fathersName, age, profession, null);
  }

  public static void getResume(String surname, String name, String fathersName, Integer age, String profession, Integer yearsOfExperience) {
    StringBuilder resumePrint = new StringBuilder();
    resumePrint.append(String.format("%s %s %s", surname, name, fathersName));
    if (age != null) {
      resumePrint.append(String.format("\nВозраст: %d", age));
    }
    if (profession != null) {
      resumePrint.append(String.format("\nПрофессия: %s", profession));
    }
    if (yearsOfExperience != null) {
      resumePrint.append(String.format("\nОпыт работы в годах: %d", yearsOfExperience));
    }
    System.out.println(resumePrint);
  }
}
