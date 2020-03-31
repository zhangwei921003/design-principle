package com.panda.study.design.pattern.chain.auth.optimize;

import com.panda.study.design.pattern.chain.auth.Member;

public class MemberService {

  public void login(String loginName, String loginPass) {
    Handler validateHandler = new ValidateHandler();
    Handler loginHandler = new LoginHandler();
    Handler authHandler = new AuthHandler();
    validateHandler.next(loginHandler);
    loginHandler.next(authHandler);
    validateHandler.doHandler(new Member(loginName, loginPass));
  }
}
