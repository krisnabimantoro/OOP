package com.Praktikum.Modul_5.Tugas;

import com.Praktikum.Modul_5.Tugas.element.*;
import com.Praktikum.Modul_5.Tugas.player.*;
import com.Praktikum.Modul_5.Tugas.role.*;
import com.Praktikum.Modul_5.Tugas.role.armor.armor;
import com.Praktikum.Modul_5.Tugas.weapon.gun;
import com.Praktikum.Modul_5.Tugas.weapon.sword;
import java.util.*;

public class Main {

  static assasin asasin = new assasin(
    3000,
    800,
    300,
    1,
    true,
    "Jalan yang baik adalah jalan yang benar"
  );

  static mage mage = new mage(2500, 700, 200, 1, true, "One shoot one kill");
  static tank tank = new tank(
    7000,
    500,
    500,
    1,
    true,
    "Perisaiku sekeras baja"
  );
  static player1 p1 = new player1(0, 0, 0, 0, false, "");
  static player2 p2 = new player2(0, 0, 0, 0, false, "");
  static gun gun = new gun("Pistol", 100);
  static sword sword = new sword("Katana", 200);
  static Scanner sc = new Scanner(System.in);
  static armor arm = new armor();

  public static void main(String[] args) {
    int x, y;

    Main obj = new Main();

    System.out.println("Pilih hero : ");
    System.out.println("1. Assasin\n2. Mage \n3. Tank");
    System.out.print("\nPlayer 1 : ");

    asasin.setAttackDamage(
      asasin.getAttackDamage() + asasin.getAttackDamage() * asasin.bonusDamage
    );

    mage.setAttackDamage(
      mage.getAttackDamage() + mage.getAttackDamage() * mage.bonusDamage
    );

    x = sc.nextInt();
    if (x == 1) {
      obj.assasin();
      obj.weapon();

      p1.setIntro(asasin.getIntro());
      p1.setHealthPoint(asasin.getHealthPoint());
      p1.setAttackDamage(asasin.getAttackDamage());
      p1.setDefensi(asasin.getDefensi());
      p1.setLevel(asasin.getLevel());
      p1.setLifeStatus(asasin.isLifeStatus());

      System.out.println("Total Damage Assasin : " + p1.getAttackDamage());
    } else if (x == 2) {
      obj.mage();

      p1.setIntro(mage.getIntro());
      p1.setHealthPoint(mage.getHealthPoint());
      p1.setAttackDamage(mage.getAttackDamage());
      p1.setDefensi(mage.getDefensi());
      p1.setLevel(mage.getLevel());
      p1.setLifeStatus(mage.isLifeStatus());
    } else if (x == 3) {
      obj.tank();

      p1.setIntro(tank.getIntro());
      p1.setHealthPoint(tank.getHealthPoint());
      p1.setAttackDamage(tank.getAttackDamage());
      p1.setDefensi(tank.getDefensi());
      p1.setLevel(tank.getLevel());
      p1.setLifeStatus(tank.isLifeStatus());
    }

    //player 2

    System.out.print("\nPlayer 2 : ");
    y = sc.nextInt();

    if (y == 1) {
      obj.assasin();
      obj.weapon();

      p2.setIntro(asasin.getIntro());
      p2.setHealthPoint(asasin.getHealthPoint());
      p2.setAttackDamage(asasin.getAttackDamage());
      p2.setDefensi(asasin.getDefensi());
      p2.setLevel(asasin.getLevel());
      p2.setLifeStatus(asasin.isLifeStatus());

      System.out.println("Total Damage Assasin : " + p2.getAttackDamage());
    } else if (y == 2) {
      obj.mage();

      p2.setIntro(mage.getIntro());
      p2.setHealthPoint(mage.getHealthPoint());
      p2.setAttackDamage(mage.getAttackDamage());
      p2.setDefensi(mage.getDefensi());
      p2.setLevel(mage.getLevel());
      p2.setLifeStatus(mage.isLifeStatus());
    } else if (y == 3) {
      obj.tank();

      p2.setIntro(tank.getIntro());
      p2.setHealthPoint(tank.getHealthPoint());
      p2.setAttackDamage(tank.getAttackDamage());
      p2.setDefensi(tank.getDefensi());
      p2.setLevel(tank.getLevel());
      p2.setLifeStatus(tank.isLifeStatus());
    }
    sc.close();

    System.out.println("\nFight Begin...");

    // if (x == 3) {
    //   for (int j = 0; j < 100; j++) {
    //     System.out.println("\nPlayer 1 Turn");
    //     System.out.println(p1.getIntro());
    //     p1.attack(p2);
    //     System.out.println("Player 2 HP " + p2.checkStatus());

    //     System.out.println("\nPlayer 2 Turn");
    //     System.out.println(p2.getIntro());
    //     arm.strengthArmor = (int) (arm.strengthArmor - p2.getAttackDamage());
    //     if (arm.strengthArmor <= 0) {
    //       arm.strengthArmor = 0;
    //       continue;
    //     }
    //     System.out.println("Armor Strength : " + arm.strengthArmor);
    //   }
    // } else if (y == 3) {
    //   for (int j = 0; j < 100; j++) {
    //     System.out.println("\nPlayer 1 Turn");
    //     System.out.println(p1.getIntro());

    //     arm.strengthArmor = (int) (arm.strengthArmor - p1.getAttackDamage());

    //     if (arm.strengthArmor <= 0) {
    //       arm.strengthArmor = 0;
    //       continue;
    //     }
    //     System.out.println("Armor Strength : " + arm.strengthArmor);

    //     System.out.println("\nPlayer 2 Turn");
    //     System.out.println(p2.getIntro());
    //     p2.attack(p1);
    //   }
    // }


    for (int i = 0; i < 100; i++) {
      System.out.println("\nPlayer 1 Turn");
      System.out.println(p1.getIntro());
      p1.attack(p2);

      System.out.println("Player 2 HP " + p2.checkStatus());

      System.out.println("\nPlayer 2 Turn");
      System.out.println(p2.getIntro());
      p2.attack(p1);
      System.out.println("Player 1 HP " + p1.checkStatus());
      if (p1.checkStatus() <= 0) {
        System.out.println("\nP2 Win");
        break;
      } else if (p2.checkStatus() <= 0) {
        System.out.println("\nP1 Win");
        break;
      }
    }
  }

  public void assasin() {
    asasin.setHealthPoint(asasin.getHealthPoint() + (asasin.getLevel() * 90));
    asasin.setAttackDamage(asasin.getAttackDamage() + (asasin.getLevel() * 30));
    asasin.setDefensi(asasin.getDefensi() + (asasin.getLevel() * 15));
    asasin.infoHero(
      asasin.getHealthPoint(),
      asasin.getAttackDamage(),
      asasin.getDefensi(),
      asasin.getLevel(),
      asasin.isLifeStatus()
    );
  }

  public void mage() {
    mage.setHealthPoint(mage.getHealthPoint() + (mage.getLevel() * 85));
    mage.setAttackDamage(mage.getAttackDamage() + (mage.getLevel() * 35));
    mage.setDefensi(mage.getDefensi() + (mage.getLevel() * 10));

    mage.infoHero(
      mage.getHealthPoint(),
      mage.getAttackDamage(),
      mage.getDefensi(),
      mage.getLevel(),
      mage.isLifeStatus()
    );
  }

  public void tank() {
    tank.setHealthPoint(tank.getHealthPoint() + (tank.getLevel() * 200));
    tank.setAttackDamage(tank.getAttackDamage() + (tank.getLevel() * 20));
    tank.setDefensi(tank.getDefensi() + (tank.getLevel() * 10));
    tank.infoHero(
      tank.getHealthPoint(),
      tank.getAttackDamage(),
      tank.getDefensi(),
      tank.getLevel(),
      tank.isLifeStatus(),
      arm.strengthArmor
    );
  }

  public void weapon() {
    System.out.println(
      "\nPilih senjata : \n1.Pistol" +
      " +att " +
      gun.baseDamage +
      "\n2.Katana " +
      "+att " +
      sword.baseDamage
    );
    int z;
    System.out.print("Pilih : ");
    z = sc.nextInt();

    if (z == 1) {
      System.out.println("Weapon = " + gun.name);
      asasin.setAttackDamage(asasin.getAttackDamage() + gun.baseDamage);
    } else if (z == 2) {
      System.out.println("Weapon = " + sword.name);
      asasin.setAttackDamage(asasin.getAttackDamage() + sword.baseDamage);
    }

    System.out.println(
      "\nPilih elemen : \n1. Fire + 100\n2. Water + 90\n3. Earth + 150\n4. Wind + 80\n0. Tidak pakai element"
    );
    System.out.print("Pilih : ");
    z = sc.nextInt();

    if (z == 1) {
      System.out.println("Weapon Element = Fire ");
      asasin.setAttackDamage(asasin.getAttackDamage() + element.fireDamage);
    } else if (z == 2) {
      System.out.println("Weapon Element = Water");
      asasin.setAttackDamage(asasin.getAttackDamage() + element.waterDamage);
    } else if (z == 3) {
      System.out.println("Weapon Element = Earth");
      asasin.setAttackDamage(asasin.getAttackDamage() + element.earthDamage);
    } else if (z == 4) {
      System.out.println("Weapon Element = Wind");
      asasin.setAttackDamage(asasin.getAttackDamage() + element.windDamage);
    } else {
      asasin.setAttackDamage(asasin.getAttackDamage() + 0);
    }
  }
}
