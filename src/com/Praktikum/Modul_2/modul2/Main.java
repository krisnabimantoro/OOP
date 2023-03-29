package com.Praktikum.Modul_2.modul2;

import com.Praktikum.Modul_2.modul2.bangun2d.*;
import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Main obj = new Main();

    int inp;

    System.out.println("==============================================");
    System.out.println("Selamat Datang di Aplikasi SOV");
    System.out.println("Menghitung luas keliling akan menjadi mudah");
    System.out.println("==============================================");
    System.out.println("1. Menghitung Bangun 2 Dimensi");
    System.out.println("2. Menghitung Bangun 3 Dimensi");
    System.out.println("0. Keluar");
    System.out.print("Pilih Menu : ");

    inp = sc.nextInt();

    switch (inp) {
      case 1:
        obj.hitung2D();
        break;
      case 2:
        obj.hitung3D();
        break;
      case 0:
        System.exit(0);
        break;
    }
    // if (input == 1) {
    //   obj.hitung2D();
    // } else if (input == 2) {
    //   obj.hitung3D();
    // } else if (input == 0) {
    //   System.exit(0);
    // }
  }

  public void hitung2D() {
    int hitung;

    // BelahKetupat ketupat = new BelahKetupat();
     Persegi persegi = new Persegi();
    // PersegiPanjang panjang = new PersegiPanjang();
    // Segitiga segitiga = new Segitiga();
    // Lingkaran lingkaran = new Lingkaran();
    // JajarGenjang genjang = new JajarGenjang();


    System.out.println("Aplikasi Penghitung Luas dan Keliling bangun datar");
    System.out.println("1. Persegi");
    System.out.println("2. Persegi Panjang");
    System.out.println("3. Segitiga");
    System.out.println("4. Lingkaran");
    System.out.println("5. Jajar Genjang");
    System.out.println("6. Belah Ketupat");
    System.out.println("0. Kembali");
    System.out.print("Pilih menu : ");
    hitung = sc.nextInt();
    switch (hitung) {
      case 1:
     persegi.main(null);
        break;
      default:
        break;
    }
  }

  public void hitung3D() {
    System.out.println("Aplikasi Penghitung Volume bangun ruang");
    System.out.println("1. Kubus");
    System.out.println("2. Balok");
    System.out.println("3. Tabung");
    System.out.println("4. Bola");
    System.out.println("5. Kerucut");
    System.out.println("0. Kembali");
    System.out.print("Pilih menu : ");
  }
}
