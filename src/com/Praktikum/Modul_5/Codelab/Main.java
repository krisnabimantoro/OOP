package com.Praktikum.Modul_5.Codelab;

public class Main {

  public static void main(String[] args) {
    plant plt = new plant();
    armor armor = new armor();

    walkingZombie wlk = new walkingZombie(100);
    armoredZombie armz = new armoredZombie(100);

    System.out.println("\nWalking Zombie sebelum diserang");
    wlk.getZombieInfo(wlk.health);

    for (int i = 0; i < 100; i++) {
      wlk.health = (int) (wlk.health - wlk.health * plt.attack(wlk));
      wlk.getZombieInfo(wlk.health);
      if (wlk.health == 0) {
        wlk.destroyed();
        break;
      }
    }

    System.out.println("Armored Zombie sebelum diserang");
    armz.getZombieInfo(armz.health, armor.strength);
    for (int i = 0; i < 100; i++) {
      armor.strength =
        (int) (armor.strength - armor.strength * plt.attackArmor());
      armz.getZombieInfo(armz.health, armor.strength);
      if (armor.strength == 0) {
        armor.destroyed();
        break;
      }
    }
    for (int j = 0; j < 100; j++) {
      armz.health = (int) (armz.health - armz.health * plt.attack(armz));
      armz.getZombieInfo(armz.health, armor.strength);
      if (armz.health == 0) {
        armz.destroyed();
        break;
      }
    }
  }
}

class walkingZombie extends zombie {

  public walkingZombie(int health) {
    super(health);
  }

  @Override
  public void destroyed() {
    System.out.println("Walking Zombie Mati\n");
  }

  @Override
  public int getZombieInfo(int damaged) {
    System.out.println("Plant Menyerang Walking Zombie");
    System.out.println("Zombie : Walking Zombie");
    System.out.println("Health : " + damaged + "\n");
    return damaged;
  }
}

class armoredZombie extends zombie {

  public armoredZombie(int health) {
    super(health);
  }

  @Override
  public void destroyed() {
    System.out.println("Armored Zombie Mati");
  }

  public int getZombieInfo(int health, int armor) {
    System.out.println("Plant Menyerang Armored Zombie");
    System.out.println("Zombie : Armored Zombie");
    System.out.println("Health : " + health);
    System.out.println("Armor : " + armor + "\n");
    return health;
  }
}

class armor implements destroyable {

  public int strength = 50;

  @Override
  public void destroyed() {
    System.out.println("Armor Hancur\n");
  }

  public int getArmorInfo(int armor) {
    return strength;
  }
}

abstract class zombie implements destroyable {

  public int health;

  public zombie(int health) {
    this.health = health;
  }

  @Override
  public void destroyed() {}

  public int getZombieInfo(int damaged) {
    return damaged;
  }
}

class plant {

  public double attack(zombie zombie) {
    if (zombie instanceof walkingZombie) {
      return 0.4;
    } else if (zombie instanceof armoredZombie) {
      return 0.2;
    } else {
      return 0;
    }
  }

  public double attackArmor() {
    return 0.5;
  }
}

interface destroyable {
  void destroyed();
}
