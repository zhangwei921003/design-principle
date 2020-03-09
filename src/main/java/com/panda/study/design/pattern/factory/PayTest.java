package com.panda.study.design.pattern.factory;

public class PayTest {

  public static void main(String[] args) {
    Payment payment = new ALiPayFactory().create();
    payment.say();
  }
}
