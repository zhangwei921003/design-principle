package com.panda.study.design.pattern.strategy.model;

/**
 * 具体策略A
 */
public class ConcreteStrategyA implements IStrategy {

  @Override
  public void algorithm() {
    System.out.println("Strategy A!!!");
  }
}
