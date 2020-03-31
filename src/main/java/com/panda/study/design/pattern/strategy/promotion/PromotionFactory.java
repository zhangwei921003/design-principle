package com.panda.study.design.pattern.strategy.promotion;

import static com.panda.study.design.pattern.strategy.promotion.Promotion.CASH;
import static com.panda.study.design.pattern.strategy.promotion.Promotion.COUPON;
import static com.panda.study.design.pattern.strategy.promotion.Promotion.DEFAULT;
import static com.panda.study.design.pattern.strategy.promotion.Promotion.GROUP;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {

  private PromotionFactory() {
  }

  private static Map<Promotion, IPromotion> promotions = new HashMap<>();
  private static final PromotionFactory INSTANCE = new PromotionFactory();

  static {
    promotions.put(COUPON, new CouponStrategy());
    promotions.put(CASH, new CashStrategy());
    promotions.put(GROUP, new GroupStrategy());
    promotions.put(DEFAULT, new EmptyStrategy());
  }

  public static PromotionFactory getInstance() {
    return INSTANCE;
  }

  public void execute(Promotion promotion) {
    if (!promotions.containsKey(promotion)) {
      promotion = DEFAULT;
    }
    promotions.get(promotion).doPromotion();
  }
}
