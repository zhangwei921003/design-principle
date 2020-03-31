package com.panda.study.design.pattern.strategy.pay.payport;

public class AliPay extends Payment {

  public String getName() {
    return "支付宝";
  }

  protected Double queryBalance(String uid) {
    Double value = 900d;
    System.out.println("查询账户：" + uid + " 余额为" + value);
    return value;
  }
}
