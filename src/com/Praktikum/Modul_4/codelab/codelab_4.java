//Krisna bimantoro - 202210370311254
package com.Praktikum.Modul_4.codelab;

public class codelab_4 {

  public static void main(String[] args) {
    //kucing
    Kucing kucing = new Kucing();

    kucing.setSuara("Kucing");
    System.out.println(kucing.getSuara());
    kucing.tampilMakanan();
    kucing.bersuara();

    //anjing
    Anjing anjing = new Anjing();

    anjing.setSuara("Anjing");
    System.out.println("\n" + anjing.getSuara());
    anjing.tampilMakanan();
    anjing.bersuara();

    //beruang
    Beruang beruang = new Beruang();

    beruang.setSuara("Beruang");
    System.out.println("\n" + beruang.getSuara());
    beruang.tampilMakanan();
    beruang.bersuara();

    //kuda
    Kuda kuda = new Kuda();

    kuda.setSuara("Kuda");
    System.out.println("\n" + kuda.getSuara());
    kuda.tampilMakanan();
    kuda.bersuara();
  }
}

abstract class hewan {

  public String suara;

  public String getSuara() {
    return "Hewan : " + this.suara;
  }

  public void setSuara(String suara) {
    this.suara = suara;
  }

  public abstract void bersuara();
}

interface lKarnivora {
  String jenis = "Karnivora";
  String makanan = "Daging";

  void tampilMakanan();
}

interface lHerbivora {
  String jenis = "Herbivora";
  String makanan = "Sayur";

  void tampilMakanan();
}

class Kucing extends hewan implements lKarnivora {

  @Override
  public void bersuara() {
    System.out.println("Suara : Mengg");
  }

  @Override
  public void tampilMakanan() {
    System.out.println("Jenis : " + jenis + "\nMakanan : " + makanan);
  }
}

class Anjing extends hewan implements lKarnivora {

  @Override
  public void bersuara() {
    System.out.println("Suara : Auggggg");
  }

  @Override
  public void tampilMakanan() {
    System.out.println("Jenis : " + jenis + "\nMakanan : " + makanan);
  }
}

class Beruang extends hewan implements lKarnivora, lHerbivora {

  @Override
  public void bersuara() {
    System.out.println("Suara : Haummm");
  }

  @Override
  public void tampilMakanan() {
    System.out.println(
      "Jenis : " +
      lKarnivora.jenis +
      " + " +
      lHerbivora.jenis +
      "\nMakanan : " +
      lKarnivora.makanan +
      " + " +
      lHerbivora.makanan
    );
  }
}

class Kuda extends hewan implements lHerbivora {

  @Override
  public void bersuara() {
    System.out.println("Suara : Suiiiiii");
  }

  @Override
  public void tampilMakanan() {
    System.out.println("Jenis : " + jenis + "\nMakanan : " + makanan);
  }
}
