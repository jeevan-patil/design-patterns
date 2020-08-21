package org.mission.design.patterns.creational.factory;

public class WindowsButton implements Button {

  @Override
  public void render() {
    System.out.println("Windows button render.");
  }

  @Override
  public void onClick(final Dialog dialog) {
    System.out.println("Windows button onClick.");
  }
}
