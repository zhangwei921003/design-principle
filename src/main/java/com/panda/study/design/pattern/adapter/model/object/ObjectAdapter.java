package com.panda.study.design.pattern.adapter.model.object;

import com.panda.study.design.pattern.adapter.model.ITarget;
import com.panda.study.design.pattern.adapter.model.SourceTarget;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.text.StrBuilder;

@RequiredArgsConstructor
public class ObjectAdapter implements ITarget {

  private final SourceTarget sourceTarget;

  @Override
  public String doAction(String source) {
    StrBuilder builder = new StrBuilder();
    builder.append("[接入对象适配器]\n");
    builder.append(sourceTarget.doSpecAction(source));
    return builder.toString();
  }
}
