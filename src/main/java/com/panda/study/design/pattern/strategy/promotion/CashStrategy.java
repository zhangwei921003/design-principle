package com.panda.study.design.pattern.strategy.promotion;

public class CashStrategy implements IPromotion {
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}
