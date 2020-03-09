package com.panda.study.design.pattern.proxy.cglib;

public class CglibProxyTest {

  public static void main(String[] args) {
    IPerson person = (IPerson) new CglibProxy(new ZhanSan()).getInstance();
    person.findLove();
  }
}
