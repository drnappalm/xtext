package org.example.xtend;

import org.eclipse.xtext.xbase.lib.InputOutput;
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
  }
}
