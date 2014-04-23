package org.example.xtend;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.example.xtend.DummyEnum;
import org.example.xtend.Helper;
import org.example.xtend.dummy;
import org.example.xtend.inverteddummy;

@SuppressWarnings("all")
public class main {
  public static void main(final String[] args) {
    final dummy dummy = new org.example.xtend.dummy();
    final inverteddummy inverted = new inverteddummy();
    InputOutput.<String>println("VALUES LIST");
    dummy.showValues();
    InputOutput.<String>println("");
    inverted.showValues();
    InputOutput.<String>println("EVEN VALUES LIST");
    dummy.showEvenValues();
    InputOutput.<String>println("");
    inverted.showEvenValues();
    InputOutput.<String>println("ODD VALUES LIST");
    dummy.showOddValues();
    InputOutput.<String>println("");
    inverted.showOddValues();
    InputOutput.<String>println("EXT METHOD");
    Helper.showMultiply(dummy, 5);
    Helper.showMultiply(inverted, 10);
    InputOutput.<String>println("ELVIS");
    dummy.printElvis();
    InputOutput.<String>println("NULL OR NOT?");
    dummy.nullProof();
    InputOutput.<String>println("ENUMERATION");
    DummyEnum _enumValue = Helper.getEnumValue(1);
    String _plus = ("1-" + _enumValue);
    String _plus_1 = (_plus + " | 2-");
    DummyEnum _enumValue_1 = Helper.getEnumValue(2);
    String _plus_2 = (_plus_1 + _enumValue_1);
    String _plus_3 = (_plus_2 + " | 3-");
    DummyEnum _enumValue_2 = Helper.getEnumValue(3);
    String _plus_4 = (_plus_3 + _enumValue_2);
    InputOutput.<String>println(_plus_4);
    InputOutput.<String>println("EXPRESSIONS");
    String _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = "No exception";
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        _xtrycatchfinallyexpression = null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    InputOutput.<String>println(_xtrycatchfinallyexpression);
    String _xtrycatchfinallyexpression_1 = null;
    try {
      throw new Exception();
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof Exception) {
        final Exception e_1 = (Exception)_t_1;
        _xtrycatchfinallyexpression_1 = "Exception";
      } else {
        throw Exceptions.sneakyThrow(_t_1);
      }
    }
    InputOutput.<String>println(_xtrycatchfinallyexpression_1);
  }
}
