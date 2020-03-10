package com.panda.study.design.pattern.flyweight.ticket;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AirTicket implements ITicket {

  private String from;
  private String to;
  private BigDecimal price;

  @Override
  public void showInfo(String bunk) {
    System.out.println(String.format("%s -> %s : %s 价格: %s 元.", from, to, bunk, price));
  }
}
