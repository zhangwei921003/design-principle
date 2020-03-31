package com.panda.study.design.pattern.strategy.promotion;

public class GroupStrategy implements IPromotion {

  public void doPromotion() {
    System.out.println("5人成团，可以优惠");
  }
}
