package com.panda.study.design.pattern.adapter.login.adapterv2.adapters;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class LoginForDouyinAdapter extends AbstractAdapter {

  @Override
  public Boolean support(Object object) {
    return object instanceof LoginForDouyinAdapter;
  }

  @Override
  public ResultMsg login(String id, Object adapter) {
    return super.loginForRegister(id, null);
  }
}
