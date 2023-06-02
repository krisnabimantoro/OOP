package com.Praktikum.Modul_5.Tugas.role;

import com.Praktikum.Modul_5.Tugas.hero;
import com.Praktikum.Modul_5.Tugas.role.damage.magicDamage;

public class mage extends hero implements magicDamage {
  public double bonusDamage = MAGIC_DMG_BONUS;


  public mage(double healthPoint, double attackDamage, double defensi, int level, boolean lifeStatus, String intro) {
    super(healthPoint, attackDamage, defensi, level, lifeStatus, intro);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void spawnIntro() {
    System.out.println("aaaaa");
  }

  public Object infoHero(
    double healthPoint,
    double attackDamage,
    double defensi,
    int level,
    boolean lifeStatus
  ) {
    System.out.println("Mage");
    System.out.println("Level : " + level);
    System.out.println("HP : " + healthPoint);
    System.out.println("Attack : " + attackDamage);
    System.out.println("Defense : " + defensi);
    System.out.println("Life Status : " + lifeStatus);
    return healthPoint;
  }
}
