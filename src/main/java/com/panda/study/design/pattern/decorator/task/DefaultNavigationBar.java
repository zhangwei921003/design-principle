package com.panda.study.design.pattern.decorator.task;

import static com.google.common.collect.Lists.newArrayList;
import static com.panda.study.design.pattern.decorator.task.Navigation.ARTICLE;
import static com.panda.study.design.pattern.decorator.task.Navigation.BUBBLE;
import static com.panda.study.design.pattern.decorator.task.Navigation.MALL;
import static com.panda.study.design.pattern.decorator.task.Navigation.QUA;
import static com.panda.study.design.pattern.decorator.task.Navigation.QUALITY_CLASS;

import java.util.List;

public class DefaultNavigationBar implements INavigation {

  @Override
  public List<Navigation> getPermission() {
    return newArrayList(QUA, ARTICLE, QUALITY_CLASS, BUBBLE, MALL);
  }
}
