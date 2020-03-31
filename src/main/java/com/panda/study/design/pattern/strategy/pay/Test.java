package com.panda.study.design.pattern.strategy.pay;

import static com.panda.study.design.pattern.strategy.pay.payport.PayType.ALI_PAY;
import static com.panda.study.design.pattern.strategy.pay.payport.PayType.JD_PAY;
import static com.panda.study.design.pattern.strategy.pay.payport.PayType.UNION_PAY;
import static com.panda.study.design.pattern.strategy.pay.payport.PayType.WECHAT_PAY;

public class Test {

  public static void main(String[] args) {
    Order order = new Order("1", "2020031401000323", 324.5);
    System.out.println(order.pay(UNION_PAY));
    System.out.println(order.pay(ALI_PAY));
    System.out.println(order.pay(WECHAT_PAY));
    System.out.println(order.pay(JD_PAY));
  }
}
