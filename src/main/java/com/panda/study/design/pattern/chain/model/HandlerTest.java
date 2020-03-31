package com.panda.study.design.pattern.chain.model;

public class HandlerTest {

  public static void main(String[] args) {
    Handler handlerA = new ConcreteHandlerA();
    Handler handlerB = new ConcreteHandlerB();
    handlerA.setNextHandler(handlerB);
    handlerA.handleRequest("requestB");
  }
}
