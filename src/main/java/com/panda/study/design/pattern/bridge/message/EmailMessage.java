package com.panda.study.design.pattern.bridge.message;

public class EmailMessage implements IMessage {

  public String send(String message) {
    return String.format("使用邮件发送:【%s】", message);
  }
}
