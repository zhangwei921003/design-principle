package com.panda.study.design.pattern.delegate.model;

public class ConcreteA implements Task {

  public void doTask() {
    System.out.println("执行 , 由A实现");
  }
}