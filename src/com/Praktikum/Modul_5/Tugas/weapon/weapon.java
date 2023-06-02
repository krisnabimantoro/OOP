package com.Praktikum.Modul_5.Tugas.weapon;

public abstract class weapon {

  public String name;
  public double baseDamage;
 

  public weapon(String name, double baseDamage) {
    this.name = name;
    this.baseDamage = baseDamage;
    // this.additionalDamage = additionalDamage;
  }

//   public double getTotalDamage() {
//     return baseDamage + additionalDamage;
//   }
}
