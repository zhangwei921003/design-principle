package com.panda.study.design.pattern.chain.auth.optimize;

import com.panda.study.design.pattern.chain.auth.Member;

public class LoginHandler extends Handler {

  public void doHandler(Member member) {
    System.out.println("登录成功！");
    member.setRoleName("管理员");
    next.doHandler(member);
  }
}
