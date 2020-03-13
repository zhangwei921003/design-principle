package com.panda.study.design.pattern.adapter.login.adapterv3;

import com.panda.study.design.pattern.adapter.login.ResultMsg;
import com.panda.study.design.pattern.adapter.login.adapterv3.adapters.ILoginAdapter;

public interface IPassportForThird {

  ResultMsg login(String param, Class<? extends ILoginAdapter> clazz);
}
