package com.Praktikum.Modul_2.modul2;

import com.Praktikum.Modul_2.modul2.bangun2d.*;
import com.Praktikum.Modul_2.modul2.bangun3d.Balok;
import com.Praktikum.Modul_2.modul2.bangun3d.Bola;
import com.Praktikum.Modul_2.modul2.bangun3d.Kerucut;
import com.Praktikum.Modul_2.modul2.bangun3d.Kubus;
import com.Praktikum.Modul_2.modul2.bangun3d.Tabung;
import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Main obj = new Main();

    int inp;

    System.out.println("\n==============================================");
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
  }

  public void hitung2D() {
    int x;

    BelahKetupat ketupat = new BelahKetupat();
    Persegi persegi = new Persegi();
    PersegiPanjang panjang = new PersegiPanjang();
    Segitiga segitiga = new Segitiga();
    Lingkaran lingkaran = new Lingkaran();
    JajarGenjang genjang = new JajarGenjang();

    System.out.println("\nAplikasi Penghitung Luas dan Keliling bangun datar");
    System.out.println("1. Persegi");
    System.out.println("2. Persegi Panjang");
    System.out.println("3. Segitiga");
    System.out.println("4. Lingkaran");
    System.out.println("5. Jajar Genjang");
    System.out.println("6. Belah Ketupat");
    System.out.println("0. Kembali");
    System.out.print("Pilih menu : ");
    x = sc.nextInt();
    switch (x) {
      case 1:
        persegi.main(null);
        break;
      case 2:
        panjang.main(null);
        break;
      case 3:
        segitiga.main(null);
        break;
      case 4:
        lingkaran.main(null);
        break;
      case 5:
        genjang.main(null);
      case 6:
        ketupat.main(null);
        break;
      case 0:
        main(null);
        break;
      default:
        break;
    }
  }

  public void hitung3D() {
    int y;
    Kubus kubus = new Kubus();
    Balok balok = new Balok();
    Kerucut kerucut = new Kerucut();
    Bola bola = new Bola();
    Tabung tabung = new Tabung();

    System.out.println("\nAplikasi Penghitung Volume bangun ruang");
    System.out.println("1. Kubus");
    System.out.println("2. Balok");
    System.out.println("3. Tabung");
    System.out.println("4. Bola");
    System.out.println("5. Kerucut");
    System.out.println("0. Kembali");
    System.out.print("Pilih menu : ");
    y = sc.nextInt();
    switch (y) {
      case 1:
        kubus.main(null);
        break;
      case 2:
        balok.main(null);
        break;
      case 3:
        tabung.main(null);
        break;
      case 4:
        bola.main(null);
        break;
      case 5:
        kerucut.main(null);
        break;
      case 0:
        main(null);
        break;
      default:
        break;
    }
  }
}
