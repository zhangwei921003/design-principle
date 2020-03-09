package com.panda.study.design.pattern.proxy.statics;

public class Test {

  public static void main(String[] args) {
    WaimaiProxy proxy = new WaimaiProxy(new XiaoMing());
    proxy.findFoods();
  }
}
