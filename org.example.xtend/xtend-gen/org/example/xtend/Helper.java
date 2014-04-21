package org.example.xtend;

import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.xtend.dummy;

@SuppressWarnings("all")
public class Helper {
  public static void showMultiply(final dummy toMultiply, final int factor) {
    final Function1<Integer,Integer> _function = new Function1<Integer,Integer>() {
      public Integer apply(final Integer it) {
        int _intValue = it.intValue();
        return Integer.valueOf((_intValue * factor));
      }
    };
    Iterable<Integer> _map = IterableExtensions.<Integer, Integer>map(toMultiply.readOnlyList, _function);
    toMultiply.showValues(((int[])Conversions.unwrapArray(_map, int.class)));
  }
  
  public static Integer showNumber(final Integer value) {
    return InputOutput.<Integer>println(value);
  }
}
