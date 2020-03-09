package com.panda.study.design.pattern.proxy.cglib;

import java.lang.reflect.Method;
import lombok.RequiredArgsConstructor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

@RequiredArgsConstructor
public class CglibProxy implements MethodInterceptor {

  private final IPerson person;

  public Object getInstance() {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(person.getClass());
    enhancer.setCallback(this);
    return enhancer.create();
  }

  private void after() {
    System.out.println("配对成功。。。");
  }

  private void before() {
    System.out.println("物色对象，匹配有缘人");
  }

  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
    before();
    Object target = methodProxy.invokeSuper(o, objects);
    after();
    return target;
  }
}
