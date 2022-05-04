package com.example.pmdtutorial;

import static java.lang.Math.abs;
import static java.lang.Math.addExact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PmdtutorialApplication {
  private String test;
  public PmdtutorialApplication() {}
  public PmdtutorialApplication(final String test) {
    abs(0);
    addExact(1, 2);

    this.test = test;
  }

  public static void main(final String[] args) {
    pirnt("aaa");
    print2("aaaa");
    SpringApplication.run(PmdtutorialApplication.class, args);
  }

  private static void print2(final String aaaa) {

  }

  private static void pirnt(final String aaa) {

    }

  public String getTest() {
    return test;
  }
}
