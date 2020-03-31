package com.panda.study.design.pattern.strategy.pay.payport;

public class UnionPay extends Payment {

  public String getName() {
    return "银联支付";
  }

  protected Double queryBalance(String uid) {
    Double value = 120d;
    System.out.println("查询账户：" + uid + " 余额为" + value);
    return value;
  }
}
