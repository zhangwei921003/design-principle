package com.panda.study.design.pattern.decorator.task;

import java.util.List;
import java.util.stream.Stream;

public class Test {

  public static void main(String[] args) {
    NavigationFactory factory = NavigationFactory.getInstance();
    Stream.of(Permission.values()).forEach(value -> {
      List<Navigation> navs = factory.getPermissionNavBar(value);
      System.out.println("==================" + value.getValue() + "访问获取权限==================");
      System.out.println(navs.stream().map(Navigation::getName).reduce((a, b) -> a + "," + b).orElse(""));
    });
  }
}
