package com.Praktikum.Modul_5.Tugas.role;

import com.Praktikum.Modul_5.Tugas.hero;

public class tank extends hero {

  

  public tank(double healthPoint, double attackDamage, double defensi, int level, boolean lifeStatus, String intro) {
    super(healthPoint, attackDamage, defensi, level, lifeStatus, intro);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void spawnIntro() {
    System.out.println("suiii");
  }

  public Object infoHero(
    double healthPoint,
    double attackDamage,
    double defensi,
    int level,
    boolean lifeStatus,
    double armor
  ) {
    System.out.println("Tank");
    System.out.println("Level : " + level);
    System.out.println("HP : " + healthPoint);
    System.out.println("Attack : " + attackDamage);
    System.out.println("Defense : " + defensi);
    System.out.println("Life Status : " + lifeStatus);
    System.out.println("Tank is armored");
    System.out.println("Armor Tank : "+armor);
    return healthPoint;
  }
}
