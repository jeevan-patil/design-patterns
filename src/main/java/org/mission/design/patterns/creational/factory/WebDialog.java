package org.mission.design.patterns.creational.factory;

public class WebDialog extends Dialog {

  @Override
  public Button createButton() {
    return new WebButton();
  }
}
