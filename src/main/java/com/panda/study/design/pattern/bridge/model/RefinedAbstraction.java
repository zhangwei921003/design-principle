package com.panda.study.design.pattern.bridge.model;

public class RefinedAbstraction extends Abstraction {

  protected RefinedAbstraction(Implementor implementor) {
    super(implementor);
  }

  @Override
  public void consume() {
    super.consume();
    System.out.println("RefinedAbstraction consume!");
  }
}
