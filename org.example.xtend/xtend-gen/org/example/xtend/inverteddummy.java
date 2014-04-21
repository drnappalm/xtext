package org.example.xtend;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.example.xtend.dummy;

@SuppressWarnings("all")
public class inverteddummy extends dummy {
  public inverteddummy() {
  }
  
  public inverteddummy(final IntegerRange changeableList) {
    super(changeableList);
  }
  
  protected void showValues(final int[] array) {
    List<Integer> _reverse = ListExtensions.<Integer>reverse(((List<Integer>)Conversions.doWrapArray(array)));
    super.showValues(((int[])Conversions.unwrapArray(_reverse, int.class)));
  }
  
  protected void showDivideableValues(final int value, final boolean divideable) {
    super.showDivideableValues(value, (!divideable));
  }
}
