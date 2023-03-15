//Krisna Bimantoro - 202210370311254
package com.Praktikum.Modul_1.CodeLab;

import java.util.*;

public class demoCalcYearsOld {

  static demoCalcYearsOld age = new demoCalcYearsOld();
  static int thisYear;
 // static int yourBirthYear;
  private static int yourBirthYear;
   
  public static void main(String[] args) {
    age.getYourBirthYear();
   
     System.out.println("Umur anda : " + yourBirthYear);
  }

  public int getYourBirthYear() {
    age.setYourBirthYear(yourBirthYear);
    thisYear = Calendar.getInstance().get(Calendar.YEAR);
    yourBirthYear = thisYear - yourBirthYear;
    return demoCalcYearsOld.yourBirthYear;
  }

  public void setYourBirthYear(int yourBirthYear) {
    
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Masukkan Tahun Kelahiran : ");
      yourBirthYear = input.nextInt();
    }
    demoCalcYearsOld.yourBirthYear = yourBirthYear;
  }

  // void setYourBirthyear() {

  //   try (Scanner input = new Scanner(System.in)) {
  //       System.out.print("Masukkan Tahun Kelahiran : ");
  //       yourBirthYear = input.nextInt();
  //   }
  // }

  // int getYourBirthYear() {
  //   age.setYourBirthyear();

  //   // System.out.println("Tanggal sekarang adalah " + tanggalSekarang);
  //   thisYear = Calendar.getInstance().get(Calendar.YEAR);
  //   yourBirthYear = thisYear - yourBirthYear;
  //   return yourBirthYear;
  // }
}
