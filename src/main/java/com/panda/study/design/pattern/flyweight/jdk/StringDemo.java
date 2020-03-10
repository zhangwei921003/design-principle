package com.panda.study.design.pattern.flyweight.jdk;

public class StringDemo {

  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";
    String str3 = "he" + "llo";
    String str4 = "he" + new String("llo");
    String str5 = new String("hello");
    String str6 = str5.intern();
    String str7 = "he";
    String str8 = "llo";
    String str9 = str7 + str8;
    System.out.println(str1 == str2); //true
    System.out.println(str1 == str3); //true
    System.out.println(str1 == str4); //false
    System.out.println(str1 == str6); //true
    System.out.println(str1 == str9);//false
    System.out.println(str4 == str5);//false
  }
}
