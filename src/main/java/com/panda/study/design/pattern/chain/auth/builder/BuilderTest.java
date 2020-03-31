package com.panda.study.design.pattern.chain.auth.builder;

public class BuilderTest {

  public static void main(String[] args) {
    MemberService memberService = new MemberService();
    memberService.login("zhangw", "666");
  }
}
