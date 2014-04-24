package org.example.xtend;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
    InputOutput.<String>println("ARRAYS/COLLECTIONS");
    final List<Integer> array = Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(1, 2, 3));
    String _join = IterableExtensions.join(array);
    String _plus_5 = ("Inmutable: " + _join);
    InputOutput.<String>println(_plus_5);
    final int[] intArray = new int[3];
    String _join_1 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(intArray)));
    String _plus_6 = ("Inmutable: " + _join_1);
    InputOutput.<String>println(_plus_6);
    final Set<Integer> set = Collections.<Integer>unmodifiableSet(Sets.<Integer>newHashSet(1, 2, 3));
    String _join_2 = IterableExtensions.join(set);
    String _plus_7 = ("Inmutable: " + _join_2);
    InputOutput.<String>println(_plus_7);
    Map<Integer,Integer> _xsetliteral = null;
    Map<Integer,Integer> _tempMap = Maps.<Integer, Integer>newHashMap();
    _tempMap.put(Integer.valueOf(1), Integer.valueOf(1));
    _tempMap.put(Integer.valueOf(2), Integer.valueOf(2));
    _tempMap.put(Integer.valueOf(3), Integer.valueOf(3));
    _xsetliteral = Collections.<Integer, Integer>unmodifiableMap(_tempMap);
    final Map<Integer,Integer> map = _xsetliteral;
    Set<Integer> _keySet = map.keySet();
    String _join_3 = IterableExtensions.join(_keySet);
    String _plus_8 = ("Inmutable: " + _join_3);
    String _plus_9 = (_plus_8 + ",");
    Collection<Integer> _values = map.values();
    String _join_4 = IterableExtensions.join(_values);
    String _plus_10 = (_plus_9 + _join_4);
    InputOutput.<String>println(_plus_10);
    final ArrayList<Integer> list = CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
    String _join_5 = IterableExtensions.join(list);
    String _plus_11 = ("Mutable: " + _join_5);
    InputOutput.<String>println(_plus_11);
    list.add(Integer.valueOf(4));
    String _join_6 = IterableExtensions.join(list);
    String _plus_12 = ("Mutable: " + _join_6);
    InputOutput.<String>println(_plus_12);
    InputOutput.<String>println("TYPED NULL");
    final org.example.xtend.dummy typedNull = ((org.example.xtend.dummy) null);
    InputOutput.<String>println(("It is still null not dummy: " + Boolean.valueOf((typedNull instanceof org.example.xtend.dummy))));
    Helper.showOperators();
    InputOutput.<String>println("INLINE TEXT");
    IntegerRange _upTo = new IntegerRange(1, 10);
    CharSequence _showInlineText = Helper.showInlineText(_upTo);
    InputOutput.<CharSequence>println(_showInlineText);
  }
}
