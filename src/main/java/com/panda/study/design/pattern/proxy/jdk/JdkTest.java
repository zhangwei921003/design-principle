package com.panda.study.design.pattern.proxy.jdk;

import com.panda.study.design.pattern.proxy.my.IPerson;
import com.panda.study.design.pattern.proxy.my.ZhanSan;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import sun.misc.ProxyGenerator;

public class JdkTest {

  public static void main(String[] args) {
    IPerson person = (IPerson) new JdkProxy(new ZhanSan()).getInstance();
    person.findLove("王", 20);
    byte[] b = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
    String file = System.getProperty("user.dir") + "/src/main/java/com/panda/study/design/pattern/proxy/jdk/$Proxy0.class";
    try {
      Files.write(Paths.get(file), b);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
