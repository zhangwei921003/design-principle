package com.panda.study.design.pattern.proxy.jdk;

import com.panda.study.design.pattern.proxy.my.IPerson;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JdkProxy implements InvocationHandler {

  private final IPerson person;

  public Object getInstance() {
    Class<?> clazz = person.getClass();
    return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    before();
    Object target = method.invoke(person, args);
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
