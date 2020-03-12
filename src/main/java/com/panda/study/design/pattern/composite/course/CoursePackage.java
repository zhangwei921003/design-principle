package com.panda.study.design.pattern.composite.course;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import org.apache.commons.lang3.text.StrBuilder;

public class CoursePackage extends CourseComponent {

  private List<CourseComponent> components;
  private final Integer level;

  public CoursePackage(String name, BigDecimal price, Integer level) {
    super(name, price);
    this.level = level;
    components = new ArrayList<>();
  }

  protected String showInfo() {
    StrBuilder builder = new StrBuilder(String.format("Course name is %s, price %s.", name, price));
    components.forEach(value -> {
      if (level != null) {
        builder.append("\n");
        IntStream.range(0, level).forEach(i -> builder.append("  "));
        IntStream.range(0, level).forEach(i -> {
          if (i == 0) {
            builder.append("+");
          }
          builder.append("-");
        });
        builder.append(value.showInfo());
      }
    });
    return builder.toString();
  }

  protected Boolean add(CourseComponent courseComponent) {
    return components.add(courseComponent);
  }

  protected Boolean remove(CourseComponent courseComponent) {
    return components.remove(courseComponent);
  }

  protected CourseComponent get(int index) {
    return components.get(index);
  }
}
