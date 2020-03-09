package com.panda.study.design.pattern.proxy.my;

public class MyProxyDemoTest {

  public static void main(String[] args) {
    IPerson person = (IPerson) new MyProxyDemo(new ZhanSan()).getInstance();
    person.findLove("张", 28);
  }
}
