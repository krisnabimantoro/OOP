package com.Praktikum.Modul_2.modul2.bangun2d;

import com.Praktikum.Modul_2.modul2.LKBangun2D;
import com.Praktikum.Modul_2.modul2.Main;


public class Segitiga extends LKBangun2D {

  private double alas;
  private double tinggi;
  static double miring;

  public void main(String[] args) {
    Segitiga obj = new Segitiga();
    System.out.print("\nMasukkan Alas : ");
    alas = sc.nextInt();
    System.out.print("Masukkan Tinggi : ");
    tinggi = sc.nextInt();

    //menentukan garis miring segitiga
    miring = Math.sqrt(alas * alas + tinggi * tinggi);

    obj.infoBangun(alas, tinggi);
    obj.hitungKeliling(keliling);
    obj.hitungLuas(luas);

    char menu;
    System.out.print("Kembali ke Menu ? Y/N : ");
    menu = sc.next().charAt(0);
    if (menu == 'y' || menu == 'Y' ) {
      Main.main(args);
    } else if (menu == 'n' || menu == 'N') {
      System.exit(0);
    }
  }

  @Override
  protected void infoBangun(double a, double b) {
    System.out.println("==============================================");

    setAlas(a);
    setTinggi(b);

    System.out.println(
      "Alas : " +
      getAlas() +
      " - Tinggi : " +
      getTinggi() +
      " - Garis miring : " +
      miring
    );
  }

  @Override
  protected void hitungKeliling(double a) {
    keliling = alas + tinggi + miring;

    System.out.print("Hasil keliling dari segitiga tersebut adalah ");
    super.hitungKeliling(a);
  }

  @Override
  protected void hitungLuas(double a) {
    luas = 0.5 * alas * tinggi;

    System.out.print("Hasil luas dari segitiga tersebut adalah ");
    super.hitungLuas(a);
  }

  public double getAlas() {
    return this.alas;
  }

  public void setAlas(double alas) {
    this.alas = alas;
  }

  public double getTinggi() {
    return this.tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }
}
