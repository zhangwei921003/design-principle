package com.panda.study.design.pattern.composite.model.transparent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

  private List<Component> components;

  public Composite(String name) {
    super(name);
    this.components = new ArrayList<Component>();
  }

  @Override
  public String operation() {
    StringBuilder builder = new StringBuilder(this.name);
    for (Component component : this.components) {
      builder.append("\n");
      builder.append(component.operation());
    }
    return builder.toString();
  }

  @Override
  public boolean addChild(Component component) {
    return this.components.add(component);
  }

  @Override
  public boolean removeChild(Component component) {
    return this.components.remove(component);
  }

  @Override
  public Component getChild(int index) {
    return this.components.get(index);
  }
}