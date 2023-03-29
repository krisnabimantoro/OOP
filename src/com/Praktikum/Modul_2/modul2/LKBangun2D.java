package com.Praktikum.Modul_2.modul2;

import java.util.*;

public class LKBangun2D {

  protected double luas;
  protected double keliling;
  protected static Scanner sc = new Scanner(System.in);

  protected void infoBangun(double a) {}

  protected void infoBangun(double a, double b) {}

  protected void infoBangun(double a, double b, double c) {}

  protected void hitungKeliling(double a) {
    setKeliling(keliling);
    System.out.println(getKeliling());
  }

  protected void hitungLuas(double a) {
    setLuas(luas);
    System.out.println(getLuas());
  }

  protected double getLuas() {
    return this.luas;
  }

  protected void setLuas(double luas) {
    this.luas = luas;
  }

  protected double getKeliling() {
    return this.keliling;
  }

  protected void setKeliling(double keliling) {
    this.keliling = keliling;
  }
}
