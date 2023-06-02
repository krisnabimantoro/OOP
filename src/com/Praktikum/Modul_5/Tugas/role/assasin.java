package com.Praktikum.Modul_5.Tugas.role;

import com.Praktikum.Modul_5.Tugas.hero;
import com.Praktikum.Modul_5.Tugas.element.element;
import com.Praktikum.Modul_5.Tugas.role.damage.criticalDamage;

public class assasin extends hero implements criticalDamage,element {
  public double bonusDamage = ATK_DMG_BONUS;
 

  public assasin(double healthPoint, double attackDamage, double defensi, int level, boolean lifeStatus, String intro) {
    super(healthPoint, attackDamage, defensi, level, lifeStatus, intro);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void spawnIntro() {
  System.out.println("ppppp");
  }

  public Object infoHero(
    double healthPoint,
    double attackDamage,
    double defensi,
    int level,
    boolean lifeStatus
  ) {

    System.out.println("Asssasin");
    System.out.println("Level : " + level);
    System.out.println("HP : " + healthPoint);
    System.out.println("Attack : " + attackDamage);
    System.out.println("Defense : " + defensi);
    System.out.println("Life Status : " + lifeStatus);
    return healthPoint;
  }
}
