package com.Praktikum.Modul_2.modul2.bangun2d;

import com.Praktikum.Modul_2.modul2.LKBangun2D;
import com.Praktikum.Modul_2.modul2.Main;

public class JajarGenjang extends LKBangun2D {

  private double alas;
  private double tinggi;
  private double miring;

  public void main(String[] args) {
    JajarGenjang obj = new JajarGenjang();
    System.out.print("\nMasukkan Alas : ");
    alas = sc.nextInt();
    System.out.print("Masukkan Tinggi : ");
    tinggi = sc.nextInt();
    System.out.print("Masukkan Miring : ");
    miring = sc.nextInt();

    obj.infoBangun(alas, tinggi, miring);
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

    setAlas(a);
    setTinggi(b);
    setMiring(c);

    System.out.println(
      "Alas : " +
      getAlas() +
      " - Tinggi : " +
      getTinggi() +
      " - miring : " +
      getMiring()
    );
  }

  @Override
  protected void hitungKeliling(double a) {
    keliling = 2 * (alas + miring);

    System.out.print("Hasil keliling dari jajar genjang tersebut adalah ");
    super.hitungKeliling(a);
  }

  @Override
  protected void hitungLuas(double a) {
    luas = alas * tinggi;

    System.out.print("Hasil luas dari jajar genjang tersebut adalah ");
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

  public double getMiring() {
    return this.miring;
  }

  public void setMiring(double miring) {
    this.miring = miring;
  }
}
