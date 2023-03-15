package com.Praktikum.Modul_1.Kegiatan.bookSystem;

import java.util.*;

public class userInput {

  private String nama;
  private String noTelp;
  private String alamat;
  private String email;

  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    
  }

  public String getNama() {
    System.out.println("Nama : " + nama);
    return this.nama;
  }

  public void setNama(String nama) {
    System.out.print("Masukkan Nama : ");
    nama = input.nextLine();
    this.nama = nama;
  }

  public String getEmail() {
    System.out.println("Email : " + email);
    return this.email;
  }

  public void setEmail(String email) {
    System.out.print("Masukkan Email : ");
    email = input.nextLine();
    this.email = email;
  }

  public String getNoTelp() {
    System.out.println("No Telp : " + noTelp);
    return this.noTelp;
  }

  public void setNoTelp(String noTelp) {
    System.out.print("Masukkan No Telp (+62) : ");
    noTelp = input.nextLine();
    this.noTelp = noTelp;
  }

  public String getAlamat() {
    System.out.println("Alamat : " + alamat);
    return this.alamat;
  }

  public void setAlamat(String alamat) {
    System.out.print("Masukkan Alamat : ");
    alamat = input.nextLine();
    this.alamat = alamat;
  }
}
