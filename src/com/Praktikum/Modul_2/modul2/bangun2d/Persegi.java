package com.Praktikum.Modul_2.modul2.bangun2d;

import com.Praktikum.Modul_2.modul2.LKBangun2D;

public class Persegi extends LKBangun2D {

  private double sisi;

  public void main(String[] args) {
    Persegi obj = new Persegi();
    obj.infoBangun(sisi);
    sisi = sc.nextInt();
    obj.hitungKeliling(sisi);
    obj.hitungLuas(sisi);

    setSisi(sisi);
  }

  @Override
  protected void infoBangun(double a) {
    System.out.print("Masukkan Sisi : ");
  }

  @Override
  protected void hitungKeliling(double a) {
    keliling = a * 4;

    System.out.println("==============================================");
    System.out.println("Sisi : " + a);
    System.out.println(
      "Hasil keliling dari persegi tersebut adalah " + keliling
    );
  }

  @Override
  protected void hitungLuas(double a) {
    luas = a * a;
    System.out.println("==============================================");
    System.out.println("Sisi : " + a);
    System.out.println("Hasil luas dari persegi tersebut adalah " + luas);
  }

  public double getSisi() {
    return this.sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }
}
