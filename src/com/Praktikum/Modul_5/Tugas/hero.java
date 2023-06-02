package com.Praktikum.Modul_5.Tugas;

public abstract class hero {

  private double healthPoint;
  private double attackDamage;
  private double defensi;
  public int level;
  private boolean lifeStatus;
  private String intro;

 

  public hero(double healthPoint, double attackDamage, double defensi, int level, boolean lifeStatus, String intro) {
    this.healthPoint = healthPoint;
    this.attackDamage = attackDamage;
    this.defensi = defensi;
    this.level = level;
    this.lifeStatus = lifeStatus;
    this.intro = intro;
}

public void attack(hero target) {
    target.reviewDamage(getAttackDamage());
  }

  public void reviewDamage(double damage) {
    double realDamage = Math.max(damage - defensi, 0);
    healthPoint -= realDamage;
    if (healthPoint <= 0) {
      healthPoint = 0;
     
    }
  }

  public abstract void spawnIntro();

  public double checkStatus() {
   return healthPoint;
  }

  public Object infoHero() {
    return 0;
  }

  public double getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(double healthPoint) {
    this.healthPoint = healthPoint;
  }

  public double getAttackDamage() {
    return attackDamage;
  }

  public void setAttackDamage(double attackDamage) {
    this.attackDamage = attackDamage;
  }

  public double getDefensi() {
    return defensi;
  }

  public void setDefensi(double defensi) {
    this.defensi = defensi;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }


public boolean isLifeStatus() {
    return lifeStatus;
}

public void setLifeStatus(boolean lifeStatus) {
    this.lifeStatus = lifeStatus;
}

public String getIntro() {
    return intro;
}

public void setIntro(String intro) {
    this.intro = intro;
}
  
}
