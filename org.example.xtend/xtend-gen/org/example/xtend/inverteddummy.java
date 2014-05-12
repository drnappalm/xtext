package org.example.xtend;

import org.example.xtend.dummy;

@SuppressWarnings("all")
public class inverteddummy extends dummy {
  public inverteddummy() {
  }
  
  public inverteddummy(final /* IntegerRange */Object changeableList) {
    super(changeableList);
  }
  
  protected void showValues(final int[] array) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method reverse is undefined for the type inverteddummy");
  }
  
  protected Object showDivideableValues(final int value, final boolean divideable) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved.");
  }
}
