package org.mission.design.patterns.creational.factory;

public class FactoryMain {

  public static void main(String[] args) {
    final String platform = "web";

    Dialog dialog;
    if (platform.equals("web")) {
      dialog = new WebDialog();
    } else if (platform.equals("windows")) {
      dialog = new WindowsDialog();
    } else {
      throw new IllegalArgumentException("Platform not supported.");
    }

    dialog.render();
  }

}
