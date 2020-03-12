package com.panda.study.design.pattern.adapter.model;

import com.panda.study.design.pattern.adapter.model.classadpter.ClassAdapter;
import com.panda.study.design.pattern.adapter.model.interfaceadapter.InterfaceAdapter;
import com.panda.study.design.pattern.adapter.model.interfaceadapter.InterfaceSourceTarget;
import com.panda.study.design.pattern.adapter.model.interfaceadapter.InterfaceTarget;
import com.panda.study.design.pattern.adapter.model.object.ObjectAdapter;

public class TargetTest {

  public static void main(String[] args) {
    ITarget target = new ClassAdapter();
    String result = target.doAction("您好");
    System.out.println(result);

    ITarget target1 = new ObjectAdapter(new SourceTarget());
    String result1 = target1.doAction("您好");
    System.out.println(result1);

    InterfaceTarget target2 = new InterfaceAdapter(new InterfaceSourceTarget());
    Object result2 = target2.function("您好");
    System.out.println(result2);
    target2.consumer("您好");
    Boolean flag = target2.predicate("您好");
    System.out.println(flag);
  }
}
