package com.panda.study.design.pattern.adapter.model.interfaceadapter;

/**
 * 接口适配器侧重需要将目标对象转换为多个满足客户要求的场景；如果每个场景都写一个adapter,显得代码冗余和繁琐。
 *
 * @param <T>
 */
public class InterfaceAdapter<T> implements InterfaceTarget<T> {

  private final InterfaceSourceTarget<T> sourceTarget;

  public InterfaceAdapter(InterfaceSourceTarget<T> sourceTarget) {
    this.sourceTarget = sourceTarget;
  }

  @Override
  public T supply() {
    return null;
  }

  @Override
  public T function(T t) {
    System.out.println("[接入接口适配器-function]");
    return sourceTarget.doAction(t);
  }

  @Override
  public void consumer(T t) {
    System.out.println("[接入接口适配器-consumer]");
    sourceTarget.doAction(t);
  }

  @Override
  public Boolean predicate(T t) {
    System.out.println("[接入接口适配器-predicate]");
    T result = sourceTarget.doAction(t);
    return result != null;
  }

  @Override
  public void action() {
  }
}
