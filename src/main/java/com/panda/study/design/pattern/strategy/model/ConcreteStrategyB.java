package com.panda.study.design.pattern.strategy.model;

/**
 * 具体策略B
 */
public class ConcreteStrategyB implements IStrategy {

  @Override
  public void algorithm() {
    System.out.println("Strategy B!!!");
  }
}
