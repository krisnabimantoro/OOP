package com.Praktikum.Modul_4;

import java.util.*;

public class item {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int x;
    System.out.println("\nPilih alat musik ");
    System.out.print(
      "Alat musik \n1. Elektronik\n2. Tidak\nPilih alat musik : "
    );
    x = sc.nextInt();
    if (x == 1) {
      gitarElektronik gtrEl = new gitarElektronik();
      gtrEl.dataElektronik();
      gtrEl.dashboard();
      gtrEl.getPriceTotally();
   
      kasir.currentPrice = gtrEl.getPrice();
    } else if (x == 2) {
      gitar gtr = new gitar();
      gtr.data();
      gtr.dashboard();
      gtr.getPriceTotally();
      kasir.currentPrice = gtr.getPrice();
    }
  }
}

abstract class listItem {

  public String brand, model;
  public int price = 0;
  public boolean onSale;
  public double discount;
  public Object[][] gitar;

  Scanner sc = new Scanner(System.in);

  public Object[][] getGitar() {
    return this.gitar;
  }

  public void setGitar(Object[][] gitar) {
    this.gitar = gitar;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }

  public boolean isOnSale() {
    return this.onSale;
  }

  public boolean getOnSale() {
    return this.onSale;
  }

  public void setOnSale(boolean onSale) {
    this.onSale = onSale;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public void data() {
    gitar =
      new Object[][] {
        { "Ibanez", "Akustik", 5000000, true },
        { "Yamaha", "Klasik", 3000000, false },
        { "Fender", "Bass", 1000000, true },
      };
  }

  public void dataElektronik() {
    gitar =
      new Object[][] {
        { "Ibanez", "Elektro - Akustik", 2500000, true },
        { "Rockwell", "Semi Hollow", 7000000, false },
        { "Krammer", "Electric", 4000000, true },
      };
  }

  public void dashboard() {
    int y;
    System.out.println("\nBrand gitar \n");

    for (int i = 0; i < gitar.length; i++) {
       
      System.out.println(getGitar()[i][0]);
    }
    System.out.print("\nPilih brand gitar : ");

    y = sc.nextInt();

    y = y - 1;

    setBrand((String) getGitar()[y][0]);
    System.out.println(getBrand());

    System.out.println("\nModel gitar : ");
    for (int i = 0; i < gitar.length; i++) {
        
      System.out.println(getGitar()[i][1]);
    }

    System.out.print("\nPilih model gitar : ");
    y = sc.nextInt();
    y = y - 1;
    setModel((String) getGitar()[y][1]);

    System.out.println(getModel());

    for (int i = 0; i < gitar.length; i++) {
      if (
        getBrand().equals(getGitar()[i][0]) &&
        getModel().equals(getGitar()[i][1])
      ) {
        setOnSale((boolean) getGitar()[i][3]);
        setPrice((int) getGitar()[i][2]);
      }
    }

    if (getPrice() == 0) {
      System.out.println("Barang kosong");
      System.exit(0);
    }
  }

  public abstract double getDiscountedPrice();

  public abstract int getPriceTotally();
}

class gitar extends listItem implements alatMusik {

  @Override
  public int getPriceTotally() {
    getDiscountedPrice();
    if (getOnSale() == true) {
      System.out.println("Harga Awal = " + getPrice());
      setDiscount((int) (getPrice() * getDiscount()));
      System.out.println("Mendapatkan discount sebesar " + getDiscount());

      setPrice((int) (getPrice() - getDiscount()));

      System.out.println("Sehingga harga barang menjadi " + getPrice());
    } else {
      System.out.println("Harga barang = " + getPrice());
    }

    return price;
  }

  @Override
  public double getDiscountedPrice() {
    if (getOnSale() == true) {
      discount = Math.round(Math.random() * MAX_DISCOUNT * 100.0) / 100.0;
      setDiscount(discount);
    }

    return discount;
  }
}

class gitarElektronik extends listItem implements alatElektronik {

  @Override
  public int getPriceTotally() {
    getDiscountedPrice();
    if (getOnSale() == true) {
      System.out.println("Harga Awal = " + getPrice());
      setDiscount((int) (getPrice() * getDiscount()));
      System.out.println("Mendapatkan discount sebesar " + getDiscount());

      setPrice((int) (getPrice() - getDiscount()));

      System.out.println("Sehingga harga barang menjadi " + getPrice());
    } else {
      System.out.println("Harga barang = " + getPrice());
    }

    return price;
  }

  @Override
  public double getDiscountedPrice() {
    if (getOnSale() == true) {
      discount = Math.round(Math.random() * MAX_DISCOUNT * 100.0) / 100.0;
      setDiscount(discount);
    }

    return discount;
  }
}

interface alatMusik {
  public double MAX_DISCOUNT = 0.15;
}

interface alatElektronik {
  public double MAX_DISCOUNT = 0.20;
}
