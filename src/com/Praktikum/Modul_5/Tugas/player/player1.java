package com.Praktikum.Modul_5.Tugas.player;

import com.Praktikum.Modul_5.Tugas.hero;

public class player1 extends hero {

  public static void main(String[] args) {
    
   
  }

  public player1(
    double healthPoint,
    double attackDamage,
    double defensi,
    int level,
    boolean lifeStatus,
    String intro
  ) {
    super(healthPoint, attackDamage, defensi, level, lifeStatus, intro);
  }

  public void spawnIntro() {
    throw new UnsupportedOperationException(
      "Unimplemented method 'spawnIntro'"
    );
  }
}
