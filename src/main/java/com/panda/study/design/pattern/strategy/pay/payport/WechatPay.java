package com.panda.study.design.pattern.strategy.pay.payport;

public class WechatPay extends Payment {

  public String getName() {
    return "微信支付";
  }

  protected Double queryBalance(String uid) {
    Double value = 263D;
    System.out.println("查询账户：" + uid + " 余额为" + value);
    return value;
  }
}
