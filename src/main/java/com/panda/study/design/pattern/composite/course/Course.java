package com.panda.study.design.pattern.composite.course;

import java.math.BigDecimal;

public class Course extends CourseComponent {

  public Course(String name, BigDecimal price) {
    super(name, price);
  }
}
