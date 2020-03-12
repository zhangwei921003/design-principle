package com.panda.study.design.pattern.adapter.login.adapterv2.adapters;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class LoginForTelAdapter extends AbstractAdapter {

  public Boolean support(Object adapter) {
    return adapter instanceof LoginForTelAdapter;
  }

  public ResultMsg login(String id, Object adapter) {
    return super.loginForRegister(id, null);
  }

}
