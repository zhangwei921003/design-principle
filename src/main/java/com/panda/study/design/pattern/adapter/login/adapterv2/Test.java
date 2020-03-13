package com.panda.study.design.pattern.adapter.login.adapterv2;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public class Test {

  public static void main(String[] args) {
    IPassportForThird adapter = new PassportForThirdAdapter();
    ResultMsg loginForQQ = adapter.loginForQQ("sdfasdfasfasfas");
    System.out.println(loginForQQ.getData());

    DouyinAdapterDecorator douyinAdapterDecorator = new DouyinAdapterDecorator(adapter);
    ResultMsg loginDouyin = douyinAdapterDecorator.loginForDouyin("aaaaa");
    System.out.println(loginDouyin.getData());
    //Member(username=sdfasdfasfasfas, password=THIRD_EMPTY, mid=14a4e774-d279-4003-850a-084b0ebbe8e9)
    //Member(username=aaaaa, password=THIRD_EMPTY, mid=5a5a7b4f-1f94-4b8d-bb7f-44be54abb58a)

  }
}
