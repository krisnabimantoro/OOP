package com.Praktikum.Modul_4;

import java.util.*;

public class managePerson {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String x;
    int y;
    System.out.print(
      "Pelanggan atau karyawan\n1. Pelanggan\n2. Karyawan\n0. Batalkan\nPilih : "
    );
    y = sc.nextInt();
    if (y == 1) {
      pelanggan plg = new pelanggan();
      System.out.print("Input Nama :");
      x = sc.next();

      plg.setName(x);
      plg.getMemberDiscount();

      kasir.currentDiscount = plg.getDiscount();
    } else if (y == 2) {
      karyawan kywn = new karyawan();

      System.out.print("Input Nama :");
      x = sc.next();

      kywn.setName(x);

      kasir.currentDiscount = kywn.discount();
    }
  }
}

abstract class person {

  public double discount;

  public String name;
  Object member[][] = {
    { "a", 1 },
    { "b", 2 },
    { "c", 3 },
    { "krisna", 1 },
    { "d", 4 },
  };

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

interface membership {
  public double PREMIUM_DISC = 0.1;
  public double GOLD_DISC = 0.075;
  public double SILVER_DISC = 0.05;

  double getMemberDiscount();
}

class pelanggan extends person implements membership {

  @Override
  public double getMemberDiscount() {
    for (int i = 0; i < member.length; i++) {
      if (getName().equals(member[i][0]) && member[i][1].equals(1)) {
        System.out.println("Member Premium discount 10%");

        return discount = PREMIUM_DISC;
      } else if (getName().equals(member[i][0]) && member[i][1].equals(2)) {
        System.out.println("Member Gold 7.5%");

        return discount = GOLD_DISC;
      } else if (getName().equals(member[i][0]) && member[i][1].equals(3)) {
        System.out.println("Member Silber discount 5%");

        return discount = SILVER_DISC;
      }
    }
    for (int i = 0; i < member.length; i++) {
      if (getName().equals(member[i][0]) == false) {
        System.out.println("Bukan member");
        return discount = 0;
      }
    }
    return discount;
  }
}

class karyawan extends person {

  public double discount() {
    for (int i = 0; i < member.length; i++) {
      if (getName().equals(member[i][0]) && member[i][1].equals(4)) {
        System.out.println("Karyawan Discount 12.5%");
        discount = 0.125;
        return discount;
      }
    }
    for (int i = 0; i < member.length; i++) {
      if (
        getName().equals(member[i][0]) == false &&
        member[i][1].equals(4) == false
      ) {
        System.out.println("Bukan karyawan");
        System.exit(0);
        return 0;
      }
    }
    return discount;
  }
}
