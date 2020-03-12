package com.panda.study.design.pattern.adapter.model.interfaceadapter;

public class InterfaceSourceTarget<T> {

  public T doAction(T source) {
    return source;
  }
}
