package com.Praktikum.Modul_2.modul2.bangun2d;

import com.Praktikum.Modul_2.modul2.LKBangun2D;
import com.Praktikum.Modul_2.modul2.Main;

public class BelahKetupat extends LKBangun2D {

  private double sisi;
  private double d1;
  private double d2;

  public void main(String[] args) {
    BelahKetupat obj = new BelahKetupat();
    System.out.print("\nMasukkan Sisi : ");
    sisi = sc.nextInt();
    System.out.print("Masukkan Diagonal 1 : ");
    d1 = sc.nextInt();
    System.out.print("Masukkan Diagonal 2 : ");
    d2 = sc.nextInt();

    obj.infoBangun(sisi, d1, d2);
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
  protected void infoBangun(double a, double b, double c) {
    System.out.println("==============================================");

    setSisi(a);
    setD1(b);
    setD2(c);

    System.out.println(
      "Sisi : " +
      getSisi() +
      " - Diagonal 1 : " +
      getD1() +
      " - Diagonal 2 : " +
      getD2()
    );
  }

  @Override
  protected void hitungKeliling(double a) {
    keliling = 4 * sisi;

    System.out.print("Hasil keliling dari Belah Ketupat tersebut adalah ");
    super.hitungKeliling(a);
  }

  @Override
  protected void hitungLuas(double a) {
    luas = (d1 * d2) / 2;

    System.out.print("Hasil luas dari Belah Ketupat tersebut adalah ");
    super.hitungLuas(a);
  }

  public double getSisi() {
    return this.sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }

  public double getD1() {
    return this.d1;
  }

  public void setD1(double d1) {
    this.d1 = d1;
  }

  public double getD2() {
    return this.d2;
  }

  public void setD2(double d2) {
    this.d2 = d2;
  }
}
