package com.panda.study.design.pattern.bridge.message;

public class SmsMessage implements IMessage {

  public String send(String message) {
    return String.format("使用短信发送:【%s】", message);
  }
}
