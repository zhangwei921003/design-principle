package com.panda.study.design.pattern.decorator.battercake;

import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;

/**
 * 基础套餐
 */
@RequiredArgsConstructor
public class BaseBatterCake extends BatterCake {

  private final Integer num;

  @Override
  protected String getName() {
    return "【煎饼" + num + "】";
  }

  @Override
  protected Integer getNumber() {
    return num;
  }

  @Override
  protected BigDecimal getPrice() {
    return new BigDecimal(5).multiply(new BigDecimal(num));
  }
}
