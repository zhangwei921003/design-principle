package com.panda.study.design.pattern.adapter.login.adapterv2.adapters;


import com.panda.study.design.pattern.adapter.login.ResultMsg;

public interface ILoginAdapter {

  Boolean support(Object object);

  ResultMsg login(String id, Object adapter);
}
