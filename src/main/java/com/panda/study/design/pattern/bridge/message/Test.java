package com.panda.study.design.pattern.bridge.message;

public class Test {

  public static void main(String[] args) {
    AbstractMessage abastractMessage = new NormalMessage(new SmsMessage());
    String message = abastractMessage.send("加班申请");
    System.out.println(message);
    abastractMessage = new UrgencyMessage(new EmailMessage());
    String message1 = abastractMessage.send("加班申请");
    System.out.println(message1);
  }
}
