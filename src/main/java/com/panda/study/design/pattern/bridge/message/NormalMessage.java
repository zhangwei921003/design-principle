package com.panda.study.design.pattern.bridge.message;

public class NormalMessage extends AbstractMessage {

  public NormalMessage(IMessage message) {
    super(message);
  }
}
