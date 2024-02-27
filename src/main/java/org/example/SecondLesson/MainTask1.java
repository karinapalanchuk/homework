package org.example.SecondLesson;

import java.util.Scanner;

public class MainTask1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    scan.skip("");

    String surname = scan.nextLine();
    String name = scan.nextLine();
    String fathersName = scan.nextLine();
    Integer age = null;
    String ageInput = scan.nextLine();
    if (!ageInput.isBlank()) {
      age = Integer.valueOf(ageInput);
    }
    String profession = null;
    String professionInput = scan.nextLine();
    if (!professionInput.isBlank()) {
      profession = professionInput;
    }
    Integer yearsOfExperience = null;
    String yearsOfExperienceInput = scan.nextLine();
    if (!yearsOfExperienceInput.isBlank()) {
      yearsOfExperience = Integer.valueOf(yearsOfExperienceInput);
    }

    Task1.getResume(surname, name, fathersName, age, profession, yearsOfExperience);
  }
}
