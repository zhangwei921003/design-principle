package com.panda.study.design.pattern.adapter.login.adapterv3.adapters;


import com.panda.study.design.pattern.adapter.login.LoginService;
import com.panda.study.design.pattern.adapter.login.ResultMsg;

public abstract class AbstractAdapter extends LoginService implements ILoginAdapter {

  protected ResultMsg loginForRegister(String username, String password) {
    if (null == password) {
      password = "THIRD_EMPTY";
    }
    return super.login(username, password);
  }
}
