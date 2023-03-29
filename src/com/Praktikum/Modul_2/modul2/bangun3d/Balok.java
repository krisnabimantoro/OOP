package com.Praktikum.Modul_2.modul2.bangun3d;

import com.Praktikum.Modul_2.modul2.LKBangun3D;
import com.Praktikum.Modul_2.modul2.Main;

public class Balok extends LKBangun3D {

  private double panjang;
  private double lebar;
  private double tinggi;

  public void main(String[] args) {
    Balok obj = new Balok();
    System.out.print("\nMasukkan Panjang : ");
    panjang = sc.nextInt();

    System.out.print("Masukkan lebar : ");
    lebar = sc.nextInt();

    System.out.print("Masukkan tinggi : ");
    tinggi = sc.nextInt();

    obj.infoBangun(panjang, lebar, tinggi);
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
  protected void infoBangun(double a, double b, double c) {
    System.out.println("==============================================");
    setPanjang(a);
    setLebar(b);
    setTinggi(c);
    System.out.println(
      "Panjang : " +
      getPanjang() +
      " - Lebar : " +
      getLebar() +
      " - Tinggi : " +
      getTinggi()
    );
  }

  @Override
  protected void hitungVolume(double a) {
    volume = panjang * lebar * tinggi;
    System.out.print("Volume dari bangun balok tersebut adalah ");
    super.hitungVolume(a);
  }

  public double getPanjang() {
    return this.panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public double getLebar() {
    return this.lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  public double getTinggi() {
    return this.tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }
}
