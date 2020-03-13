package com.panda.study.design.pattern.adapter.login.adapterv2;

import com.panda.study.design.pattern.adapter.login.ResultMsg;
import com.panda.study.design.pattern.adapter.login.adapterv2.adapters.ILoginAdapter;
import com.panda.study.design.pattern.adapter.login.adapterv2.adapters.LoginForQQAdapter;
import com.panda.study.design.pattern.adapter.login.adapterv2.adapters.LoginForTelAdapter;
import com.panda.study.design.pattern.adapter.login.adapterv2.adapters.LoginForTokenAdapter;
import com.panda.study.design.pattern.adapter.login.adapterv2.adapters.LoginForWechatAdapter;

public class PassportForThirdAdapter implements IPassportForThird {

  public ResultMsg loginForQQ(String openId) {
    return processLogin(openId, LoginForQQAdapter.class);
  }

  public ResultMsg loginForWechat(String openId) {

    return processLogin(openId, LoginForWechatAdapter.class);

  }

  public ResultMsg loginForToken(String token) {

    return processLogin(token, LoginForTokenAdapter.class);
  }

  public ResultMsg loginForPhone(String phone, String code) {
    return processLogin(phone, LoginForTelAdapter.class);
  }

  protected ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
    try {
      ILoginAdapter adapter = clazz.newInstance();
      if (adapter.support(adapter)) {
        return adapter.login(id, adapter);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
