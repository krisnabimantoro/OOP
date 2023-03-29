package com.Praktikum.Modul_2.modul2.bangun3d;

import com.Praktikum.Modul_2.modul2.LKBangun3D;
import com.Praktikum.Modul_2.modul2.Main;

public class Bola extends LKBangun3D {

  private double jariJari;

  public void main(String[] args) {
    Bola obj = new Bola();
    System.out.print("\nMasukkan jari-jari : ");
    jariJari = sc.nextInt();

    obj.infoBangun(jariJari);
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
    setJariJari(a);
    System.out.println("Jari-jari : " + getJariJari());
  }

  @Override
  protected void hitungVolume(double a) {
    volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    System.out.print("Volume dari bangun bola tersebut adalah ");
    super.hitungVolume(a);
  }

  public double getJariJari() {
    return this.jariJari;
  }

  public void setJariJari(double jariJari) {
    this.jariJari = jariJari;
  }
}
