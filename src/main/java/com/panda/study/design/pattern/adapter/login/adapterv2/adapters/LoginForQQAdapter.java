package com.panda.study.design.pattern.adapter.login.adapterv2.adapters;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class LoginForQQAdapter extends AbstractAdapter {

  public Boolean support(Object adapter) {
    return adapter instanceof LoginForQQAdapter;
  }

  public ResultMsg login(String id, Object adapter) {
    return super.loginForRegister(id, null);
  }
}
