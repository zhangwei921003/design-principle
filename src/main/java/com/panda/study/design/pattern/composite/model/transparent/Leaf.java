package com.panda.study.design.pattern.composite.model.transparent;

public class Leaf extends Component {

  public Leaf(String name) {
    super(name);
  }

  @Override
  public String operation() {
    return this.name;
  }
}