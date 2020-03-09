package com.panda.study.design.pattern.decorator.task.decorator;

import com.panda.study.design.pattern.decorator.task.INavigation;
import com.panda.study.design.pattern.decorator.task.Navigation;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AbstractNavigationBarDecorator implements INavigation {

  protected final INavigation navigation;

  @Override
  public List<Navigation> getPermission() {
    return navigation.getPermission();
  }
}
