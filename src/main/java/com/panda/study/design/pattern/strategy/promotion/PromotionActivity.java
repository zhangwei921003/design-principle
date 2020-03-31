package com.panda.study.design.pattern.strategy.promotion;

public class PromotionActivity {

  private final IPromotion promotion;

  public PromotionActivity(IPromotion promotion) {
    this.promotion = promotion;
  }

  public void execute() {
    promotion.doPromotion();
  }
}
