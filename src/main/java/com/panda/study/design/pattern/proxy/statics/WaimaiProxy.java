package com.panda.study.design.pattern.proxy.statics;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WaimaiProxy implements IPerson {

  private final IPerson person;

  public void findFoods() {
    before();
    person.findFoods();
    after();
  }

  private void before() {
    System.out.println("等待接单中。。。");
  }

  private void after() {
    System.out.println("接单了，在路上。。。");
  }
}
