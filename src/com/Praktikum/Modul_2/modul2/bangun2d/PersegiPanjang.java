package com.Praktikum.Modul_2.modul2.bangun2d;

import com.Praktikum.Modul_2.modul2.LKBangun2D;
import com.Praktikum.Modul_2.modul2.Main;

public class PersegiPanjang extends LKBangun2D {

  private double panjang;
  private double lebar;

  public void main(String[] args) {
    PersegiPanjang obj = new PersegiPanjang();
    System.out.print("\nMasukkan Panjang : ");
    panjang = sc.nextInt();
    System.out.print("Masukkan Lebar : ");
    lebar = sc.nextInt();

    obj.infoBangun(panjang, lebar);
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

    setPanjang(a);
    setLebar(b);

    System.out.println(
      "Panjang : " + getPanjang() + " - Lebar : " + getLebar()
    );
  }

  @Override
  protected void hitungKeliling(double a) {
    keliling = (panjang * 2) + (lebar * 2);

    System.out.print("Hasil keliling dari persegi panjang tersebut adalah ");
    super.hitungKeliling(a);
  }

  @Override
  protected void hitungLuas(double a) {
    luas = panjang * lebar;

    System.out.print("Hasil luas dari persegi panjang tersebut adalah ");
    super.hitungLuas(a);
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
}
