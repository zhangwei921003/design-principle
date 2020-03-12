package com.panda.study.design.pattern.adapter.login.adapterv1;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class Test {

  public static void main(String[] args) {
    PassportForThirdAdapter adapter = new PassportForThirdAdapter();
    ResultMsg login = adapter.login("zhangw", "123456");
    System.out.println(login.getData());
    ResultMsg loginForQQ = adapter.loginForQQ("sjooguwoersdfjhasjfsa");
    System.out.println(loginForQQ.getData());
    ResultMsg loginForWechat = adapter.loginForWechat("slfsjoljsdo8234ssdfs");
    System.out.println(loginForWechat.getData());
    ResultMsg loginForQQ2 = adapter.loginForQQ("sjooguwoersdfjhasjfsa");
    System.out.println(loginForQQ2.getData());
  }
}
