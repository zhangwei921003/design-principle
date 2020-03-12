package com.panda.study.design.pattern.composite.course;

import java.math.BigDecimal;

public class CourseTest {

  public static void main(String[] args) {
    // 课程包
    CourseComponent root = new CoursePackage("Java架构师课程", new BigDecimal(9800), 1);

    // 子节点课程包
    CourseComponent design = new CoursePackage("设计模式专题", new BigDecimal(3900), 2);
    CourseComponent micro = new CoursePackage("微服务专题", new BigDecimal(3900), 2);
    CourseComponent springCloud = new CoursePackage("Spring Cloud", new BigDecimal(3900), 3);
    CourseComponent tool = new CoursePackage("架构师必备工具", new BigDecimal(3900), 2);

    // 课程
    CourseComponent composite = new Course("组合模式", new BigDecimal(880));
    CourseComponent spring = new Course("spring基础", new BigDecimal(880));
    CourseComponent cloud = new Course("认识Spring Cloud", new BigDecimal(880));
    CourseComponent git = new Course("git入门与提升", new BigDecimal(800));
    CourseComponent java = new Course("认识Java", new BigDecimal(800));

    design.add(composite);
    micro.add(spring);
    micro.add(springCloud);
    springCloud.add(cloud);
    tool.add(git);
    root.add(java);
    root.add(design);
    root.add(micro);
    root.add(tool);

    String result = root.showInfo();
    System.out.println(result);
  }

}
