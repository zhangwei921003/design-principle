package com.panda.study.design.pattern.strategy.promotion;

public class EmptyStrategy implements IPromotion {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
