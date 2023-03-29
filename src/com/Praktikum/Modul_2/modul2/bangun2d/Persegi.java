package com.Praktikum.Modul_2.modul2.bangun2d;

import com.Praktikum.Modul_2.modul2.LKBangun2D;
import com.Praktikum.Modul_2.modul2.Main;

public class Persegi extends LKBangun2D {

  private double sisi;

  public void main(String[] args) {
    Persegi obj = new Persegi();
    System.out.print("\nMasukkan Sisi : ");
    sisi = sc.nextInt();
    
    obj.infoBangun(sisi);
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
  protected void infoBangun(double a) {
    System.out.println("==============================================");
    setSisi(a);
    System.out.println("Sisi : " + getSisi());
  }

  @Override
  protected void hitungKeliling(double a) {
    keliling = sisi * 4;
    System.out.print("Hasil keliling dari persegi tersebut adalah " );
    super.hitungKeliling(a);
  }

  @Override
  protected void hitungLuas(double a) {
    luas = sisi * sisi;

    System.out.print("Hasil luas dari persegi tersebut adalah " );
    super.hitungLuas(a);
  }

  public double getSisi() {
    return this.sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }
}
