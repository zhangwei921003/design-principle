package com.panda.study.design.pattern.chain.model;

public class ConcreteHandlerB extends Handler {

  public void handleRequest(String request) {
    if ("requestB".equals(request)) {
      System.out.println(this.getClass().getSimpleName() + " deal with request: " + request);
      return;
    }
    if (this.nextHandler != null) {
      this.nextHandler.handleRequest(request);
    }
  }
}