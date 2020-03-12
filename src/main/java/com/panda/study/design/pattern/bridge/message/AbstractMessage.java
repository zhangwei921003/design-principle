package com.panda.study.design.pattern.bridge.message;

public abstract class AbstractMessage {

  private final IMessage message;

  public AbstractMessage(IMessage message) {
    this.message = message;
  }

  String send(String message) {
    return this.message.send(message);
  }
}
