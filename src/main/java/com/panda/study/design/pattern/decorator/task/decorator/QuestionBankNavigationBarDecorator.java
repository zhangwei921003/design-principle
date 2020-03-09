package com.panda.study.design.pattern.decorator.task.decorator;

import static com.panda.study.design.pattern.decorator.task.Navigation.QUESTION_BANK;

import com.panda.study.design.pattern.decorator.task.INavigation;
import com.panda.study.design.pattern.decorator.task.Navigation;
import java.util.List;

public class QuestionBankNavigationBarDecorator extends AbstractNavigationBarDecorator {

  public QuestionBankNavigationBarDecorator(INavigation navigation) {
    super(navigation);
  }

  @Override
  public List<Navigation> getPermission() {
    List<Navigation> permission = navigation.getPermission();
    permission.add(QUESTION_BANK);
    return permission;
  }
}
