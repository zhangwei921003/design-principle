package com.panda.study.design.pattern.decorator.task.decorator;

import static com.panda.study.design.pattern.decorator.task.Navigation.HOMEWORK;

import com.panda.study.design.pattern.decorator.task.INavigation;
import com.panda.study.design.pattern.decorator.task.Navigation;
import java.util.List;

public class HomeworkNavigationBarDecorator extends AbstractNavigationBarDecorator {

  public HomeworkNavigationBarDecorator(INavigation navigation) {
    super(navigation);
  }

  @Override
  public List<Navigation> getPermission() {
    List<Navigation> permission = navigation.getPermission();
    permission.add(HOMEWORK);
    return permission;
  }
}
