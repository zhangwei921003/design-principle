package com.panda.study.design.pattern.delegate.employ;

public class Boss {

  public void command(String task, Leader leader) {
    leader.doing(task);
  }
}
