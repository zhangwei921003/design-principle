package com.panda.study.design.pattern.delegate.model;

public class ConcreteB implements Task {

  public void doTask() {
    System.out.println("执行 , 由B实现");
  }
}