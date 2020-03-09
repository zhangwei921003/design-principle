package com.panda.study.design.pattern.proxy;

public class Client {

  public static void main(String[] args) {
    Proxy proxy = new Proxy(new RealSubject());
    proxy.create();
  }
}
