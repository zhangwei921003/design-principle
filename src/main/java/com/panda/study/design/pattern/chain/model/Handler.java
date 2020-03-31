package com.panda.study.design.pattern.chain.model;

public abstract class Handler {

  protected Handler nextHandler;

  public void setNextHandler(Handler successor) {
    this.nextHandler = successor;
  }

  public abstract void handleRequest(String request);

}