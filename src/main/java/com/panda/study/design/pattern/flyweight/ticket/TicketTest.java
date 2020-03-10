package com.panda.study.design.pattern.flyweight.ticket;

public class TicketTest {

  public static void main(String[] args) {
    TicketFactory factory = TicketFactory.getInstance();
    ITicket ticket = factory.getTicket("成都", "北京西");
    ticket.showInfo("卧铺");
    ITicket ticket1 = factory.getTicket("成都", "北京西");
    ticket1.showInfo("硬座");
  }
}
