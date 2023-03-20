package com.Praktikum.Modul_2.codelab.Aritmatics;

import com.Praktikum.Modul_2.codelab.Operator;

public class Penjumlahan extends Operator {
    @Override
  public double operation(double a, double b, double c) {
    double operation = a+b+c;
    System.out.println("Hasil Penjumalahan adalah " + operation);
    return operation;
  }

  @Override
  public double operation(double a, double b) {
    double operation = a+b;
    System.out.println("Hasil Penjumalahan adalah " + operation);
    return operation;
  }
}
