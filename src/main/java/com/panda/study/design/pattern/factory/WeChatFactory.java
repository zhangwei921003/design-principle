package com.panda.study.design.pattern.factory;

public class WeChatFactory implements PaymentFactory {

  public Payment create() {
    return new WeChatPay();
  }
}
