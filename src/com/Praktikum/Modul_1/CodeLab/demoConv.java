//Krisna Bimantoro - 202210370311254

package com.Praktikum.Modul_1.CodeLab;

public class demoConv {

  static final double meter = 1;
  static double cm = 0, mm = 0;

  // static demoConv conv = new demoConv();

  public static void main(String[] args) {
    demoConv.dispConv();
  }

  static double convCM() {
    cm = meter * 100;
    return cm;
  }

  static double convMM() {
    mm = meter * 1000;
    return mm;
  }

  static void dispConv() {
    demoConv.convCM();
    demoConv.convMM();
    //menggunakan printf
    //System.out.printf("%.2f Meter = %.2f Cm, %.2f Mm", meter, cm, mm);

    
    //menggunakan string format
    // System.out.println(
    //   String.format("%.2f ", meter) +
    //   "Meter = " +
    //   String.format("%.2f ", demoConv.convCM()) +
    //   "CM, " +
    //   String.format("%.2f ", demoConv.convMM()) +
    //   "MM"
    // );

    //Menggunakan println
     System.out.println("1 Meter =" + cm + " Cm " + mm + " Mm");
  }
}
