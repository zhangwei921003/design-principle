package com.panda.study.design.pattern.chain.auth.optimize;

public class OptimizeTest {

  public static void main(String[] args) {
    MemberService memberService = new MemberService();
    memberService.login("zhangw", "666");
  }
}