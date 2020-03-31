package com.panda.study.design.pattern.strategy.promotion;

public class CouponStrategy implements IPromotion {
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
