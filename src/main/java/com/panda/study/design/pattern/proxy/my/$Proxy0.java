package com.panda.study.design.pattern.proxy.my;

import java.lang.reflect.*;

public final class $Proxy0 extends MyProxy implements IPerson {

  public $Proxy0(MyInvocationHandler var1) {
    super(var1);
  }

  public final String findLove(String var0, Integer var1) {
    try {
      Method m = IPerson.class.getMethod("findLove", new Class[]{String.class, Integer.class});
      return ((String) super.h.invoke(this, m, new Object[]{var0, var1}));
    } catch (RuntimeException | Error var2) {
      throw var2;
    } catch (Throwable var3) {
      throw new UndeclaredThrowableException(var3);
    }
  }
}
