package com.panda.study.design.pattern.adapter.login.adapterv1;


import com.panda.study.design.pattern.adapter.login.LoginService;
import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class PassportForThirdAdapter extends LoginService implements IPassportForThird {

  public ResultMsg loginForQQ(String openId) {
    return loginForRegister(openId, null);
  }

  public ResultMsg loginForWechat(String openId) {
    return loginForRegister(openId, null);
  }

  public ResultMsg loginForToken(String token) {
    return loginForRegister(token, null);
  }

  public ResultMsg loginForPhone(String phone, String code) {
    return loginForRegister(phone, null);
  }

  private ResultMsg loginForRegister(String username, String password) {
    if (null == password) {
      password = "THIRD_EMPTY";
    }
    return super.login(username, password);
  }
}
