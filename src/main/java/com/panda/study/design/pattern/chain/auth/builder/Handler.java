package com.panda.study.design.pattern.chain.auth.builder;

import com.panda.study.design.pattern.chain.auth.Member;

public abstract class Handler<T> {

  protected Handler next;

  public void next(Handler next) {
    this.next = next;
  }

  public abstract void doHandler(Member member);

  public static class Builder<T> {

    private Handler<T> head;
    private Handler<T> tail;

    public Builder<T> addHandler(Handler handler) {
      do {
        if (this.head == null) {
          this.head = this.tail = handler;
          return this;
        }
        this.tail.next(handler);
        this.tail = handler;
      } while (tail == null);//在框架中，如果是双向链表，会判断是否已经到了尾部
      return this;
    }

    public Handler<T> build() {
      return this.head;
    }
  }
}
