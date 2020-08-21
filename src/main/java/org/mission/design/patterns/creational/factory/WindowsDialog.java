package org.mission.design.patterns.creational.factory;

public class WindowsDialog extends Dialog {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
