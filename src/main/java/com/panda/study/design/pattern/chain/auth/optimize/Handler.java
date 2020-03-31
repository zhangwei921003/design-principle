package com.panda.study.design.pattern.chain.auth.optimize;

import com.panda.study.design.pattern.chain.auth.Member;

public abstract class Handler {

  protected Handler next;

  public void next(Handler next) {
    this.next = next;
  }

  public abstract void doHandler(Member member);
}
