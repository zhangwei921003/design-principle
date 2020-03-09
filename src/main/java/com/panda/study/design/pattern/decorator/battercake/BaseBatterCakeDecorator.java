package com.panda.study.design.pattern.decorator.battercake;

import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BaseBatterCakeDecorator extends BatterCake {

  private final Integer num;
  private final BatterCake batterCake;

  @Override
  protected String getName() {
    return batterCake.getName() + "【煎饼" + num + "】";
  }

  @Override
  protected Integer getNumber() {
    return batterCake.getNumber() + num;
  }

  @Override
  protected BigDecimal getPrice() {
    return batterCake.getPrice().add(new BigDecimal(5).multiply(new BigDecimal(num)));
  }
}
