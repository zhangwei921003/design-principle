package com.panda.study.design.pattern.decorator.task;

import com.panda.study.design.pattern.decorator.task.decorator.AbstractNavigationBarDecorator;
import com.panda.study.design.pattern.decorator.task.decorator.GrowthNavigationBarDecorator;
import com.panda.study.design.pattern.decorator.task.decorator.HomeworkNavigationBarDecorator;
import com.panda.study.design.pattern.decorator.task.decorator.QuestionBankNavigationBarDecorator;
import com.panda.study.design.pattern.decorator.task.decorator.UserManagerNavigationBarDecorator;
import java.util.List;

public class NavigationFactory {

  private final static NavigationFactory INSTANCE = new NavigationFactory();

  public static NavigationFactory getInstance() {
    return INSTANCE;
  }

  public List<Navigation> getPermissionNavBar(Permission permission) {
    INavigation navigation = new DefaultNavigationBar();
    navigation = new AbstractNavigationBarDecorator(navigation);
    switch (permission) {
      case ADMIN:
        navigation = new QuestionBankNavigationBarDecorator(navigation);
        navigation = new GrowthNavigationBarDecorator(navigation);
        navigation = new HomeworkNavigationBarDecorator(navigation);
        navigation = new UserManagerNavigationBarDecorator(navigation);
        return navigation.getPermission();
      case VIP_USER:
        navigation = new QuestionBankNavigationBarDecorator(navigation);
        navigation = new GrowthNavigationBarDecorator(navigation);
        navigation = new HomeworkNavigationBarDecorator(navigation);
        return navigation.getPermission();
      case NORMAL_USER:
        navigation = new QuestionBankNavigationBarDecorator(navigation);
        return navigation.getPermission();
      default:
        return navigation.getPermission();
    }
  }
}
