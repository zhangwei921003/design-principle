package com.panda.study.design.pattern.adapter.model.classadpter;

import com.panda.study.design.pattern.adapter.model.ITarget;
import com.panda.study.design.pattern.adapter.model.SourceTarget;
import org.apache.commons.lang3.text.StrBuilder;

public class ClassAdapter extends SourceTarget implements ITarget {

  @Override
  public String doAction(String source) {
    StrBuilder builder = new StrBuilder();
    builder.append("[接入类适配器]\n");
    builder.append(super.doSpecAction(source));
    return builder.toString();
  }
}
