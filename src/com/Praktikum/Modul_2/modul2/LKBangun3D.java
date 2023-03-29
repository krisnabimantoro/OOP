package com.Praktikum.Modul_2.modul2;
import java.util.*;;
public class LKBangun3D {

  protected double volume;
  protected static Scanner sc = new Scanner(System.in);

  protected void infoBangun(double a) {}

  protected void infoBangun(double a, double b) {}

  protected void infoBangun(double a, double b, double c) {}

  protected void hitungVolume(double a) {
    setVolume(volume);
    System.out.println(getVolume());
  }

  protected double getVolume() {
    return this.volume;
  }

  protected void setVolume(double volume) {
    this.volume = volume;
  }
}
