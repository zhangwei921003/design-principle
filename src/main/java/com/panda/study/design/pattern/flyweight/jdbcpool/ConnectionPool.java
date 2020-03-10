package com.panda.study.design.pattern.flyweight.jdbcpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

  private Vector<Connection> pools;
  private String url = "jdbc:mysql://localhost:3306/test";
  private String driverClassName = "com.mysql.jdbc.Driver";
  private String userName = "root";
  private String password = "123456";
  private Integer poolSize = 100;

  public ConnectionPool() {
    this.pools = new Vector<>(pools);
    Connection conn = null;
    try {
      Class.forName(driverClassName);
      for (int i = 0; i < poolSize; i++) {
        conn = DriverManager.getConnection(url, userName, password);
        pools.add(conn);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public synchronized Connection getConnection() {
    if (pools.size() > 0) {
      return pools.remove(0);
    }
    return null;
  }

  public synchronized void release(Connection conn) {
    pools.add(conn);
  }
}
