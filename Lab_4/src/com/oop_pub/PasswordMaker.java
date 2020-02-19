package com.oop_pub;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;


public class PasswordMaker {
  private static final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  private final int MAGIC_NUMBER = 15;
  private final String MAGIC_STRING;
  private RandomStringGenerator randomStringGenerator;
  private String name;

//  private static PasswordMaker instance = new PasswordMaker();
  private static PasswordMaker instance;
  private static int counter;

  static {
    instance = new PasswordMaker();
  }

  private PasswordMaker() {
    this.MAGIC_STRING = this.randomAlphaNumeric(20);
    System.out.println(this.MAGIC_STRING);
  }

  public static PasswordMaker getInstance() {
    counter++;
    System.out.println(counter);
//    if (instance == null) {
//      instance = new PasswordMaker();
//    }
    return instance;
  }

  public int getMAGIC_NUMBER() {
    return MAGIC_NUMBER;
  }

  public String getMAGIC_STRING() {
    return MAGIC_STRING;
  }

  public RandomStringGenerator getRandomStringGenerator() {
    return randomStringGenerator;
  }

  public void setRandomStringGenerator(RandomStringGenerator randomStringGenerator) {
    this.randomStringGenerator = randomStringGenerator;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword(String name) {
//    String randomString;
//    StringBuilder stringBuilder = new StringBuilder();
//    for (int i = 0; i < 10; i++) {
//      int rand = new Random().nextInt(MAGIC_STRING.length());
//      stringBuilder.append(this.MAGIC_STRING.charAt(rand));
//    }
//    System.out.println(stringBuilder.toString());
    RandomStringGenerator magicRandomSubString = new RandomStringGenerator(10, this.MAGIC_STRING);
    String magicSubString = magicRandomSubString.next();
    System.out.println(magicSubString);
    this.randomStringGenerator = new RandomStringGenerator(this.MAGIC_NUMBER, magicSubString);
    String string = this.randomStringGenerator.next();
    int randomNumber = new Random().nextInt(101);
    return string + name.length() + randomNumber;
  }

  public String randomAlphaNumeric(int count) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < count; i++) {
      int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
      builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
  }
}
