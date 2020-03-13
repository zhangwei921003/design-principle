package com.panda.study.design.pattern.adapter.login.adapterv3.adapters;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class LoginForWechatAdapter extends AbstractAdapter {

  public Boolean support(Object adapter) {
    return adapter instanceof LoginForWechatAdapter;
  }

  public ResultMsg login(String id, Object adapter) {
    return super.loginForRegister(id, null);
  }


}
