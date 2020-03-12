package com.panda.study.design.pattern.adapter.login.adapterv2;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class Test {

  public static void main(String[] args) {
    IPassportForThird adapter = new PassportForThirdAdapter();
    ResultMsg loginForQQ = adapter.loginForQQ("sdfasdfasfasfas");
    System.out.println(loginForQQ.getData());
  }
}
