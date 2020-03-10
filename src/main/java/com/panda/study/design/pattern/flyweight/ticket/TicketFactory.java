package com.panda.study.design.pattern.flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {

  private final static TicketFactory INSTANCE = new TicketFactory();
  private static Map<String, ITicket> ticketPool = new ConcurrentHashMap<>();


  public static TicketFactory getInstance() {
    return INSTANCE;
  }

  public ITicket getTicket(String from, String to) {
    String key = from + "->" + to;
    if (!ticketPool.containsKey(key)) {
      ITicket ticket = new TrainTicket(from, to);
      System.out.println(String.format("新建火车票信息:%s -> %s", from, to));
      ticketPool.put(key, ticket);
      return ticket;
    }
    System.out.println(String.format("从缓存中获取火车票信息:%s -> %s", from, to));
    return ticketPool.get(key);
  }

}
