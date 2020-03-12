package com.panda.study.design.pattern.adapter.model;

public class SourceTarget {

  public String doSpecAction(String source) {
    return String.format("源角色:%s.", source);
  }
}
