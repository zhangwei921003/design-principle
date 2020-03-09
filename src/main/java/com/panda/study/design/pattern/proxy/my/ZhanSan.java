package com.panda.study.design.pattern.proxy.my;


public class ZhanSan implements IPerson {

  public String findLove(String name, Integer age) {
    return "基本要求: 姓以【" + name + "】开头,年龄必须大于【" + age + "】岁";
  }
}
