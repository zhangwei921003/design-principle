package com.panda.study.design.pattern.strategy.pay.payport;

import lombok.Getter;

@Getter
public enum PayType {
  ALI_PAY,
  JD_PAY,
  UNION_PAY,
  WECHAT_PAY
}
