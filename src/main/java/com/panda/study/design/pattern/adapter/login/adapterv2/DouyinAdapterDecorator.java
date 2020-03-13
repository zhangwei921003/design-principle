package com.panda.study.design.pattern.adapter.login.adapterv2;

import com.panda.study.design.pattern.adapter.login.ResultMsg;
import com.panda.study.design.pattern.adapter.login.adapterv2.adapters.LoginForDouyinAdapter;

public class DouyinAdapterDecorator extends PassportForThirdAdapter {

  private final IPassportForThird passportForThird;

  public DouyinAdapterDecorator(IPassportForThird passportForThird) {
    this.passportForThird = passportForThird;
  }

  public ResultMsg loginForDouyin(String openId) {
    return processLogin(openId, LoginForDouyinAdapter.class);
  }
}
