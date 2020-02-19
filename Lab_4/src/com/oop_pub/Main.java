package com.oop_pub;

public class Main {
  public static void main(String[] args) {
//    PasswordMaker.getInstance().setName("Marius");
//    String string = PasswordMaker.getInstance().getPassword();
//    System.out.println(string);

    PasswordMaker passwordMaker = PasswordMaker.getInstance();
//    passwordMaker.setName();
    String string = passwordMaker.getPassword("Marius");
    System.out.println(string);
    string = passwordMaker.getPassword("Marius");
    System.out.println(string);

//    PasswordMaker passwordMaker = new PasswordMaker("Marius");
//    System.out.println(passwordMaker.getMAGIC_STRING());
//    String string = passwordMaker.getPassword();
//    System.out.println(string);
//    passwordMake
  }
}
