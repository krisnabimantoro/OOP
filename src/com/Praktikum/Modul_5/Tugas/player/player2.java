package com.Praktikum.Modul_5.Tugas.player;

import com.Praktikum.Modul_5.Tugas.hero;

public class player2 extends hero {

 

  public player2(double healthPoint, double attackDamage, double defensi, int level, boolean lifeStatus, String intro) {
    super(healthPoint, attackDamage, defensi, level, lifeStatus, intro);
   
  }

  @Override
  public void spawnIntro() {
   
    throw new UnsupportedOperationException(
      "Unimplemented method 'spawnIntro'"
    );
  }

  
}
