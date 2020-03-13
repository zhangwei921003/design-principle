package com.panda.study.design.pattern.adapter.login.adapterv3;

import com.panda.study.design.pattern.adapter.login.ResultMsg;
import com.panda.study.design.pattern.adapter.login.adapterv3.adapters.LoginForQQAdapter;

public class Test {

  public static void main(String[] args) {
    IPassportForThird adapter = new PassportForThirdAdapter();
    ResultMsg loginForQQ = adapter.login("sdfasdfasfasfas", LoginForQQAdapter.class);
    System.out.println(loginForQQ.getData());
    //Member(username=sdfasdfasfasfas, password=THIRD_EMPTY, mid=cbe726df-43a0-4b3f-b347-242d8a93b8e5)
  }
}
