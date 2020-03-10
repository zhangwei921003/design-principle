package com.panda.study.design.pattern.composite.model.safe;

public abstract class Component {

  protected String name;

  public Component(String name) {
    this.name = name;
  }

  public abstract String operation();
}