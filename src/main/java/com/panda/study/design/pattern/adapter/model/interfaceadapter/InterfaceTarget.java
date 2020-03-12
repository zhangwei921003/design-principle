package com.panda.study.design.pattern.adapter.model.interfaceadapter;

public interface InterfaceTarget<T> {

  T supply();

  T function(T t);

  void consumer(T t);

  Boolean predicate(T t);

  void action();
}
