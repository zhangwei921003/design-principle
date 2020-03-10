package com.panda.study.design.pattern.flyweight.jdk;

public class IntegerDemo {

  public static void main(String[] args) {
    Integer a = Integer.valueOf(100);
    Integer b = 100;

    Integer c = Integer.valueOf(1000);
    Integer d = 1000;

    System.out.println(a == b); // true
    System.out.println(c == d); // false
  }
}
