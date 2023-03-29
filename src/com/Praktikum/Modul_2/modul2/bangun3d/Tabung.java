package com.Praktikum.Modul_2.modul2.bangun3d;

import com.Praktikum.Modul_2.modul2.LKBangun3D;
import com.Praktikum.Modul_2.modul2.Main;

public class Tabung extends LKBangun3D{
    private double jariJari;
    private double tinggi;

    
  public void main(String[] args) {
    Tabung obj = new Tabung();
    System.out.print("\nMasukkan jari-jari : ");
    jariJari = sc.nextInt();
    System.out.print("Masukkan tinggi : ");
    tinggi = sc.nextInt();

    obj.infoBangun(jariJari,tinggi);
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
  protected void infoBangun(double a,double b) {
    System.out.println("==============================================");
    setJariJari(a);
    setTinggi(b);
    System.out.println("Jari-jari : " + getJariJari() + " - Tinggi : "+getTinggi());
  }

  @Override
  protected void hitungVolume(double a) {
    volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
   
    System.out.print("Volume dari bangun Tabung tersebut adalah ");
    super.hitungVolume(a);
  }

    public double getJariJari() {
        return this.jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

}
