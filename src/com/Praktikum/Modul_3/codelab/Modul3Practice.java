package com.Praktikum.Modul_3.codelab;

import java.util.*;

public class Modul3Practice {

  private double value;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Modul3Practice mainObj = new Modul3Practice();
    converter conv = new converter();

    int x;
    System.out.println("Yard Converter to m,cm,feet & miles");
    System.out.println(
      "1. Yard to M \n2. Yard to CM\n3. Yard to Feet\n4. Yard to Miles"
    );

    System.out.print("Pilih menu : ");
    x = sc.nextInt();

    System.out.print("Masukkan Yard : ");
    mainObj.setValue(mainObj.value = sc.nextInt(), null);
    if (x == 1) {
      System.out.println(
        "Hasil konversi = " + conv.setValueToM(mainObj.getValue())
      );
    } else if (x == 2) {
      System.out.println(
        "Hasil konversi = " + conv.setValueToCM(mainObj.getValue())
      );
    } else if (x == 3) {
      System.out.println(
        "Hasil konversi = " + conv.setValueToFeet(mainObj.getValue())
      );
    } else if (x == 4) {
      System.out.println(
        "Hasil konversi = " + conv.setValueToMiles(mainObj.getValue())
      );
    }

    sc.close();
  }

  public double getValue() {
    return this.value;
  }

  public void setValue(double value, String params) {
    this.value = value;
  }
}
