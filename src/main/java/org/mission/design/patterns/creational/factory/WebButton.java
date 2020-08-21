package org.mission.design.patterns.creational.factory;

public class WebButton implements Button {

  @Override
  public void render() {
    System.out.println("Web button render.");
  }

  @Override
  public void onClick(Dialog dialog) {
    System.out.println("Web button onClick.");
  }
}
