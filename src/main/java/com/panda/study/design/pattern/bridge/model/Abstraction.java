package com.panda.study.design.pattern.bridge.model;

public abstract class Abstraction {

  private final Implementor implementor;

  protected Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  public void consume() {
    implementor.action();
  }
}
