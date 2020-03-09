package com.panda.study.design.pattern.decorator.task.decorator;

import static com.panda.study.design.pattern.decorator.task.Navigation.USER_MANAGER;

import com.panda.study.design.pattern.decorator.task.INavigation;
import com.panda.study.design.pattern.decorator.task.Navigation;
import java.util.List;

public class UserManagerNavigationBarDecorator extends AbstractNavigationBarDecorator {

  public UserManagerNavigationBarDecorator(INavigation navigation) {
    super(navigation);
  }

  @Override
  public List<Navigation> getPermission() {
    List<Navigation> permission = navigation.getPermission();
    permission.add(USER_MANAGER);
    return permission;
  }
}
