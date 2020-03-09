package com.panda.study.design.pattern.proxy.my;

import java.lang.reflect.Method;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyProxyDemo implements MyInvocationHandler {

  private final IPerson person;

  public Object getInstance() {
    Class<?> clazz = person.getClass();
    return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    before();
    Object target = method.invoke(person, args);
    System.out.println(target);
    after();
    return target;
  }

  private void after() {
    System.out.println("配对成功。。。");
  }

  private void before() {
    System.out.println("物色对象，匹配有缘人");
  }
}
