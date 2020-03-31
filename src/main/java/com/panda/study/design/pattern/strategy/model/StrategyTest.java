package com.panda.study.design.pattern.strategy.model;

public class StrategyTest {

  public static void main(String[] args) {
    Context context = new Context(new ConcreteStrategyA());
    context.algorithm();
    Context context1 = new Context(new ConcreteStrategyB());
    context1.algorithm();
  }
}
