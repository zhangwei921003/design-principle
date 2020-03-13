package com.panda.study.design.pattern.adapter.login.adapterv3.adapters;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class LoginForTokenAdapter extends AbstractAdapter {

  public Boolean support(Object adapter) {
    return adapter instanceof LoginForTokenAdapter;
  }

  public ResultMsg login(String id, Object adapter) {
    return super.loginForRegister(id, null);
  }

}
