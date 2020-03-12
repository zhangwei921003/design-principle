package com.panda.study.design.pattern.adapter.login.adapterv1;

import com.panda.study.design.pattern.adapter.login.ResultMsg;

public interface IPassportForThird {

  ResultMsg loginForQQ(String openId);

  ResultMsg loginForWechat(String openId);

  ResultMsg loginForToken(String token);

  ResultMsg loginForPhone(String phone, String code);
}
