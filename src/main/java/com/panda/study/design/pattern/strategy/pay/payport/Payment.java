package com.panda.study.design.pattern.strategy.pay.payport;

import com.panda.study.design.pattern.strategy.pay.MsgResult;

public abstract class Payment {

  public abstract String getName();

  protected abstract Double queryBalance(String uid);

  public MsgResult pay(String uid, double amount) {
    //根据账户查询余额是否足够
    if (queryBalance(uid) < amount) {
      return new MsgResult(500, "支付失败", "余额不足");
    }
    return new MsgResult(200, "支付成功", "支付金额" + amount);
  }
}
