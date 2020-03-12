package com.panda.study.design.pattern.bridge.course;

import lombok.Data;

@Data
public class AbstractCourse implements ICourse {

  private INote note;
  private IVideo video;
}
