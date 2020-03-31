package com.panda.study.design.pattern.strategy.pay;

import com.panda.study.design.pattern.strategy.pay.payport.PayStrategy;
import com.panda.study.design.pattern.strategy.pay.payport.PayType;
import com.panda.study.design.pattern.strategy.pay.payport.Payment;

public class Order {

  private String uid;
  private String orderId;
  private Double amount;

  public Order(String uid, String orderId, Double amount) {
    this.uid = uid;
    this.orderId = orderId;
    this.amount = amount;
  }

  public MsgResult pay(PayType payType) {
    Payment payment = PayStrategy.get(payType);
    System.out.println("欢迎使用" + payment.getName());
    System.out.println("订单号:" + orderId + ",交易金额为" + amount + "，开始扣款");
    return payment.pay(uid, amount);
  }
}
