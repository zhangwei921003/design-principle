package com.panda.study.design.pattern.adapter.login.adapterv3;

import com.panda.study.design.pattern.adapter.login.ResultMsg;
import com.panda.study.design.pattern.adapter.login.adapterv3.adapters.ILoginAdapter;

public class PassportForThirdAdapter implements IPassportForThird {

  @Override
  public ResultMsg login(String param, Class<? extends ILoginAdapter> clazz) {
    try {
      ILoginAdapter adapter = clazz.newInstance();
      if (adapter.support(adapter)) {
        return adapter.login(param, adapter);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
