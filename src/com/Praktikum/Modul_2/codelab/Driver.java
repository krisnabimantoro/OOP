package com.Praktikum.Modul_2.codelab;

import java.util.*;

import com.Praktikum.Modul_2.codelab.Aritmatics.Pembagian;
import com.Praktikum.Modul_2.codelab.Aritmatics.Pengurangan;
import com.Praktikum.Modul_2.codelab.Aritmatics.Penjumlahan;
import com.Praktikum.Modul_2.codelab.Aritmatics.Perkalian;

public class Driver {

  public static void main(String[] args) {
    Pembagian bagi = new Pembagian();
    Pengurangan kurang = new Pengurangan();
    Penjumlahan jumlah = new Penjumlahan();
    Perkalian kali = new Perkalian();
    Scanner input = new Scanner(System.in);

    double a, b, c;
    int pilih = 0;
    System.out.println("Pilih input 3 atau 2 angka");
    pilih = input.nextInt();

    if (pilih == 2) {

      System.out.println("input 2 angka");
      a = input.nextDouble();
      b = input.nextDouble();

      bagi.operation(a, b);
      kurang.operation(a, b);
      jumlah.operation(a, b);
      kali.operation(a, b);
    } else if (pilih == 3) {

      System.out.println("input 3 angka");
      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();

      bagi.operation(a, b, c);
      kurang.operation(a, b, c);
      jumlah.operation(a, b, c);
      kali.operation(a, b, c);
    }

    input.close();
  }
}
