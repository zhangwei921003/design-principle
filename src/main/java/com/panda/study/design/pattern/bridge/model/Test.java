package com.panda.study.design.pattern.bridge.model;

public class Test {

  public static void main(String[] args) {
    Implementor implementor = new ConcreteImplementor();
    Abstraction abstraction = new RefinedAbstraction(implementor);
    abstraction.consume();
  }
}
