package com.Praktikum.Modul_2.modul2.bangun2d;

import com.Praktikum.Modul_2.modul2.LKBangun2D;
import com.Praktikum.Modul_2.modul2.Main;

public class Lingkaran extends LKBangun2D {

  private double jariJari;

  public void main(String[] args) {
    Lingkaran obj = new Lingkaran();
    System.out.print("\nMasukkan Jari-jari : ");
    jariJari = sc.nextInt();

    obj.infoBangun(jariJari);
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
    setJariJari(a);
    System.out.println("Sisi : " + getJariJari());
  }

  @Override
  protected void hitungKeliling(double a) {
    keliling = 2 * Math.PI * jariJari;
    System.out.print("Hasil keliling dari lingkaran tersebut adalah ");
    super.hitungKeliling(a);
  }

  @Override
  protected void hitungLuas(double a) {
    luas = Math.PI * jariJari * jariJari;

    System.out.print("Hasil luas dari lingkaran tersebut adalah ");
    super.hitungLuas(a);
  }

  public double getJariJari() {
    return this.jariJari;
  }

  public void setJariJari(double jarijari) {
    this.jariJari = jarijari;
  }
}
