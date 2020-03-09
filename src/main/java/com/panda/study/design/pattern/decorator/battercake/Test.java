package com.panda.study.design.pattern.decorator.battercake;

public class Test {

  /**
   * 装饰器模式实际上是特殊的代理模式，而且是静态代理 它与静态代理最大的不同点在于 is-a关系，侧重自身功能的提升和拓展。 代理模式强调对代理过程的控制，通过获取到代理对象的引用（不一定是is-a关系）来掌握RealSubject的访问控制。
   * <p>
   * 例如：小明需要租房子，1.提出需求->2.房源的搜索->3.联系房东看房、洽谈价格等->4.签订租房合同、正式入住。
   * <p>
   * 在上述案例中，步骤2和3既可以委托给房屋中介，也可以小明自己完成。
   * <p>
   * 当委托给中介时候，此时类似于代理模式；当小明自己完成时，类似于装饰器模式，不过小明需要提供提高自己找房源，确定目标房子等等能力来达到入住房子的目的。
   * </p>
   *
   * @param args
   */
  public static void main(String[] args) {
    BatterCake cake = new BaseBatterCake(1);
    System.out.println("购买的煎饼套餐是: " + cake.getName() + " 总计数量:" + cake.getNumber() + " 总价格：" + cake.getPrice());
    cake = new EggBatterCakeDecorator(2, cake);
    cake = new BaseBatterCakeDecorator(3, cake);
    cake = new SausageBatterCakeDecorator(3, cake);
    System.out.println("购买的煎饼套餐是: " + cake.getName() + " 总计数量:" + cake.getNumber() + " 总价格：" + cake.getPrice());
  }
}
