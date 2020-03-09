package com.panda.study.design.pattern.proxy;

public class RealSubject implements ISubject {

  public void create() {
    System.out.println("RealSubject create instance.");
  }
}
