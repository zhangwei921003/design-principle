package com.panda.study.design.pattern.bridge.message;

public class UrgencyMessage extends AbstractMessage {

  public UrgencyMessage(IMessage message) {
    super(message);
  }

  String send(String message) {
    return String.format("【加急】%s", super.send(message));
  }
}
