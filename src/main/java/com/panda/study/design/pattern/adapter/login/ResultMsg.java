package com.panda.study.design.pattern.adapter.login;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultMsg {

  private int code;
  private String msg;
  private Object data;
}
