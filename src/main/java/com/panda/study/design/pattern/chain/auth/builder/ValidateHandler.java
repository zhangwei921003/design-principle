package com.panda.study.design.pattern.chain.auth.builder;

import static org.apache.commons.lang3.StringUtils.isEmpty;

import com.panda.study.design.pattern.chain.auth.Member;

public class ValidateHandler extends Handler {

  public void doHandler(Member member) {
    if (isEmpty(member.getLoginName()) || isEmpty(member.getPassword())) {
      System.out.println("用户名和密码为空");
      return;
    }
    System.out.println("用户名和密码不为空，可以往下执行");
    if (null != next) {
      next.doHandler(member);
    }
  }
}