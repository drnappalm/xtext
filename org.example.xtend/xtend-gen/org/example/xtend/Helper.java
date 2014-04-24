package org.example.xtend;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.example.xtend.DummyEnum;
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
  
  public static DummyEnum getEnumValue(final int value) {
    DummyEnum _switchResult = null;
    switch (value) {
      case 1:
        _switchResult = DummyEnum.One;
        break;
      case 2:
        _switchResult = DummyEnum.Two;
        break;
      case 3:
        _switchResult = DummyEnum.Three;
        break;
    }
    return _switchResult;
  }
  
  public static Integer showOperators() {
    Integer _xblockexpression = null;
    {
      Integer int1 = new Integer(150000);
      Integer int2 = new Integer(291001);
      InputOutput.<String>println("OPERATORS");
      boolean _equals = Objects.equal(int1, int1);
      String _plus = ("int1 == int1 -> " + Boolean.valueOf(_equals));
      InputOutput.<String>println(_plus);
      InputOutput.<String>println(("int1 == 150000 -> " + Boolean.valueOf(((int1).intValue() == 150000))));
      boolean _notEquals = (!Objects.equal(int1, int1));
      String _plus_1 = ("int1 != int1 -> " + Boolean.valueOf(_notEquals));
      InputOutput.<String>println(_plus_1);
      boolean _tripleEquals = (int1 == int1);
      String _plus_2 = ("int1 === int1 -> " + Boolean.valueOf(_tripleEquals));
      InputOutput.<String>println(_plus_2);
      InputOutput.<String>println(("int1 === 150000 -> " + Boolean.valueOf(((int1).intValue() == 150000))));
      boolean _tripleNotEquals = (int1 != int1);
      String _plus_3 = ("int1 !== int1 -> " + Boolean.valueOf(_tripleNotEquals));
      InputOutput.<String>println(_plus_3);
      Pair<Integer,Integer> _mappedTo = Pair.<Integer, Integer>of(int1, int2);
      String _plus_4 = ("int1 -> int2 -> " + _mappedTo);
      InputOutput.<String>println(_plus_4);
      IntegerRange _upTo = new IntegerRange((int1).intValue(), (int2).intValue());
      String _plus_5 = ("int1 .. int2 -> " + _upTo);
      InputOutput.<String>println(_plus_5);
      ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange((int1).intValue(), (int2).intValue(), false);
      String _plus_6 = ("int1 >.. int2 -> " + _greaterThanDoubleDot);
      InputOutput.<String>println(_plus_6);
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange((int1).intValue(), (int2).intValue(), true);
      String _plus_7 = ("int1 ..< int2 -> " + _doubleDotLessThan);
      InputOutput.<String>println(_plus_7);
      InputOutput.<Integer>println(Integer.valueOf(((int1).intValue() + (int2).intValue())));
      _xblockexpression = InputOutput.<Integer>println(Integer.valueOf(((int1).intValue() + (int2).intValue())));
    }
    return _xblockexpression;
  }
  
  public static CharSequence showInlineText(final IntegerRange range) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("List of numbers:");
    _builder.newLine();
    _builder.append("================");
    _builder.newLine();
    {
      for(final Integer i : range) {
        _builder.append(i, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
