package com.panda.study.design.pattern.chain.auth.builder;

import com.panda.study.design.pattern.chain.auth.Member;

public class MemberService {

  public void login(String loginName, String password) {

    Handler.Builder builder = new Handler.Builder();
    Handler handler = builder.addHandler(new ValidateHandler())
        .addHandler(new LoginHandler())
        .addHandler(new AuthHandler())
        .build();
    handler.doHandler(new Member(loginName, password));
  }
}
