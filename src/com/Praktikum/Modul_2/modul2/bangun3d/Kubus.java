package com.Praktikum.Modul_2.modul2.bangun3d;

import com.Praktikum.Modul_2.modul2.LKBangun3D;
import com.Praktikum.Modul_2.modul2.Main;

public class Kubus extends LKBangun3D {

  private double rusuk;

  public void main(String[] args) {
    Kubus obj = new Kubus();
    System.out.print("\nMasukkan rusuk : ");
    rusuk = sc.nextInt();

    obj.infoBangun(rusuk);
    obj.hitungVolume(volume);

    char menu;
    System.out.print("Kembali ke Menu ? Y/N : ");
    menu = sc.next().charAt(0);
    if (menu == 'y' || menu == 'Y') {
      Main.main(args);
    } else if (menu == 'n' || menu == 'N') {
      System.exit(0);
    }
  }

  @Override
  protected void infoBangun(double a) {
    System.out.println("==============================================");
    setRusuk(a);
    System.out.println("Sisi : " + getRusuk());
  }

  @Override
  protected void hitungVolume(double a) {
    volume = rusuk * rusuk * rusuk;
    System.out.print("Volume dari bangun kubus tersebut adalah ");
    super.hitungVolume(a);
  }

  public double getRusuk() {
    return this.rusuk;
  }

  public void setRusuk(double rusuk) {
    this.rusuk = rusuk;
  }
}
