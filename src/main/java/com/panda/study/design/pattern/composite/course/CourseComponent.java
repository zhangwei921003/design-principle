package com.panda.study.design.pattern.composite.course;

import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class CourseComponent {

  protected final String name;
  protected final BigDecimal price;

  protected String showInfo() {
    return String.format("Course name is %s, price %s.", name, price);
  }

  protected Boolean add(CourseComponent courseComponent) {
    throw new UnsupportedOperationException("not support add course!");
  }

  protected Boolean remove(CourseComponent courseComponent) {
    throw new UnsupportedOperationException("not support remove course!");
  }

  protected CourseComponent get(int index) {
    throw new UnsupportedOperationException("not support get course!");
  }
}
