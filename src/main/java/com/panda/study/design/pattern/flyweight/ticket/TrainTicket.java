package com.panda.study.design.pattern.flyweight.ticket;

import java.math.BigDecimal;
import java.util.Random;
import lombok.Data;

@Data
public class TrainTicket implements ITicket {

  private String from;
  private String to;
  private BigDecimal price;

  public TrainTicket(String from, String to) {
    this.from = from;
    this.to = to;
  }

  @Override
  public void showInfo(String bunk) {
    this.price = new BigDecimal(new Random().nextInt(500));
    System.out.println(String.format("%s -> %s : %s 价格: %s 元.", from, to, bunk, this.price));
  }
}
