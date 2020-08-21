package org.mission.design.patterns.creational.factory;

public abstract class Dialog {

  abstract Button createButton();

  public void render() {
    final Button okButton = createButton();
    okButton.render();
    System.out.println("Dialog render");
  }
}
