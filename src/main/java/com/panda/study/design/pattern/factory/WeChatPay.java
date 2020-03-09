package com.panda.study.design.pattern.factory;

public class WeChatPay implements Payment {

  public void say() {
    System.out.println("你选择了微信进行支付.");
  }
}
