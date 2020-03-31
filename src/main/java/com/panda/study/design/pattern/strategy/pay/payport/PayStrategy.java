package com.panda.study.design.pattern.strategy.pay.payport;

import static com.panda.study.design.pattern.strategy.pay.payport.PayType.ALI_PAY;
import static com.panda.study.design.pattern.strategy.pay.payport.PayType.JD_PAY;
import static com.panda.study.design.pattern.strategy.pay.payport.PayType.UNION_PAY;
import static com.panda.study.design.pattern.strategy.pay.payport.PayType.WECHAT_PAY;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

  private static Map<PayType, Payment> strategy = new HashMap<>();

  static {
    strategy.put(ALI_PAY, new AliPay());
    strategy.put(JD_PAY, new JDPay());
    strategy.put(WECHAT_PAY, new WechatPay());
    strategy.put(UNION_PAY, new UnionPay());
  }

  public static Payment get(PayType payType) {
    if (!strategy.containsKey(payType)) {
      return strategy.get(ALI_PAY);
    }
    return strategy.get(payType);
  }
}
