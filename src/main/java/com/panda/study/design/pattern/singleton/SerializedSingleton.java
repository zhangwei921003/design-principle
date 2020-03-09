package com.panda.study.design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

  private SerializedSingleton() {
    if (SingletonHolder.INSTANCE != null) {
      throw new RuntimeException("Can not create duplicated instance!");
    }
  }

  public static final SerializedSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

  /**
   * provide the implementation of readResolve() method
   * step1:{@link ObjectInputStream#readObject()}
   * step2:{@link ObjectStreamClass#hasReadResolveMethod()}
   */
  private Object readResolve() {
    return getInstance();
  }

  private static class SingletonHolder {

    private static final SerializedSingleton INSTANCE = new SerializedSingleton();
  }

  public static void main(String[] args) {
    try {

      SerializedSingleton instance = SerializedSingleton.getInstance();
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
          "filename.ser"));
      out.writeObject(instance);
      out.close();

      //deserialize from file to object
      ObjectInputStream in = new ObjectInputStream(new FileInputStream(
          "filename.ser"));
      SerializedSingleton instance1 = (SerializedSingleton) in.readObject();
      in.close();

      System.out.println("instance hashCode=" + instance.hashCode()); //1989972246
      System.out.println("instance1 hashCode=" + instance1.hashCode()); //1989972246
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
