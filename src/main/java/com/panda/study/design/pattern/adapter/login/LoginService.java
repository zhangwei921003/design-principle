package com.panda.study.design.pattern.adapter.login;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginService {

  private Map<String, Member> cache = new ConcurrentHashMap<>();

  public ResultMsg register(String username, String password) {
    Member member = new Member(username, password);
    if (!cache.containsKey(username)) {
      cache.put(username, member);
    }
    return new ResultMsg(200, "注册成功", member);
  }

  public ResultMsg login(String username, String password) {
    Member member = cache.get(username);
    if (member == null) {
      member = (Member) register(username, password).getData();
    }
    if (password.equals(member.getPassword())) {
      return new ResultMsg(200, "登录成功", member);
    }
    return new ResultMsg(0, "登录失败", null);
  }
}
