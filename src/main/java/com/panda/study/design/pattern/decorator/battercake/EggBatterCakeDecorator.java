package com.panda.study.design.pattern.decorator.battercake;

import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EggBatterCakeDecorator extends BatterCake {

  private final Integer num;
  private final BatterCake batterCake;

  @Override
  protected String getName() {
    return batterCake.getName() + "【鸡蛋" + num + "】";
  }

  @Override
  protected Integer getNumber() {
    return batterCake.getNumber() + num;
  }

  @Override
  protected BigDecimal getPrice() {
    return batterCake.getPrice().add(new BigDecimal(2).multiply(new BigDecimal(num)));
  }
}
