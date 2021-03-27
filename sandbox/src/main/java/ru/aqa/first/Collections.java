package ru.aqa.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};

    List<String> languages = new ArrayList<String>();
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");
    languages.add("PHP");

    for (String l : languages) {
      System.out.println("Ja hochu vyuchit " + l);

      List<String> language = Arrays.asList("Java", "C#", "Python", "PHP");

      for (int i = 0; i < language.size(); i++) {
        System.out.println("Ja hochu vyuchit " + language.get(i));

        List languages2 = Arrays.asList("Java", "C#", "Python", "PHP"); //так неудобно

        for (Object o : languages2) {
          System.out.println("Ja hochu vyuchit " + o);

        }
      }
    }
