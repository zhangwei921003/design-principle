package com.panda.study.design.pattern.strategy.promotion;

import static com.panda.study.design.pattern.strategy.promotion.Promotion.CASH;
import static com.panda.study.design.pattern.strategy.promotion.Promotion.COUPON;
import static com.panda.study.design.pattern.strategy.promotion.Promotion.DEFAULT;
import static com.panda.study.design.pattern.strategy.promotion.Promotion.GROUP;

public class PromotionFactoryTest {

  public static void main(String[] args) {
    PromotionFactory factory = PromotionFactory.getInstance();
    factory.execute(COUPON);
    factory.execute(CASH);
    factory.execute(GROUP);
    factory.execute(DEFAULT);
  }
}
