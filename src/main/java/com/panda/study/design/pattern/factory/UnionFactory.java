package com.panda.study.design.pattern.factory;

public class UnionFactory implements PaymentFactory {

  public Payment create() {
    return new UnionPay();
  }
}
