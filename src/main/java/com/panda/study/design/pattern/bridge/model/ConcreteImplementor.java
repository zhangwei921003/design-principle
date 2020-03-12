package com.panda.study.design.pattern.bridge.model;

public class ConcreteImplementor implements Implementor {

  @Override
  public void action() {
    System.out.println("my name is concrete implementor!");
  }
}
