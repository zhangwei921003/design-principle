package com.panda.study.design.pattern.decorator.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 权限控制：
 * <p>
 * 游客:QUA,ARTICLE,QUALITY_CLASS,BUBBLE,MALL
 * 普通用户:QUA,ARTICLE,QUALITY_CLASS,BUBBLE,MALL,QUESTION_BANK
 * 会员用户:QUA,ARTICLE,QUALITY_CLASS,BUBBLE,MALL,QUESTION_BANK,HOMEWORK,GROWTH
 * 管理员:all
 * </p>
 */
@Getter
@RequiredArgsConstructor
public enum Navigation {

  QUA("问答"),
  ARTICLE("文章"),
  QUALITY_CLASS("精品课"),
  BUBBLE("冒泡"),
  MALL("商城"),
  HOMEWORK("作业"),
  QUESTION_BANK("题库"),
  GROWTH("成长墙"),
  USER_MANAGER("用户管理");
  private final String name;

}