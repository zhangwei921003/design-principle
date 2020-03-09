package com.panda.study.design.pattern.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Proxy implements ISubject {

  private final ISubject subject;

  public void create() {
    before();
    subject.create();
    after();
  }

  private void before() {
    System.out.println("Proxy before method");
  }

  private void after() {
    System.out.println("Proxy after method");
  }
}
