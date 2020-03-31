package com.panda.study.design.pattern.strategy.pay.payport;

public class JDPay extends Payment {

  public String getName() {
    return "京东白条";
  }

  protected Double queryBalance(String uid) {
    Double value = 500d;
    System.out.println("查询账户：" + uid + " 余额为" + value);
    return value;
  }
}
