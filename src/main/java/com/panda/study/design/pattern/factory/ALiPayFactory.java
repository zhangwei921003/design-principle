package com.panda.study.design.pattern.factory;

public class ALiPayFactory implements PaymentFactory {

  public Payment create() {
    return new ALiPay();
  }
}
