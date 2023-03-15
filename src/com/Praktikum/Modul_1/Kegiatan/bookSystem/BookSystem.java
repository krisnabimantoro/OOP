package com.Praktikum.Modul_1.Kegiatan.bookSystem;

import java.util.*;

public class BookSystem {

  private String nama;
  private String noTelp;
  private String alamat;
  private String email;
  private int[][] room = {
    { 0, 101, 1000000 },
    { 1, 102, 2000000 },
    { 0, 201, 4000000 },
  };

  Scanner input = new Scanner(System.in);
  static BookSystem user = new BookSystem();

  public static void main(String[] args) {
    user.init();
    user.bookRoom();
  }

  public void doPayment(int noRoom) {
    System.out.println("=========================");
    System.out.print("Masukkan Tunai : ");
    input.nextInt();

    System.out.println("Kamar berhasil dipesan");

    room[noRoom][0] = 0;
    int ulang;
    System.out.println("Ingin memesan kamar lagi? 0/1");
    ulang = input.nextInt();
    while (ulang == 1);
    {
      user.bookRoom();
    }
  }

  public void room() {
    System.out.println("Rayz Hotel");
    String x;
    for (int i = 0; i < room.length; i++) {
      if (room[i][0] == 0) {
        x = " (Tidak Tersedia)";
      } else {
        x = " (Tersedia)";
      }
      System.out.println(i + 1 + " No. " + room[i][1] + x);
    }
  }

  public void bookRoom() {
    int x, z = 1;

    do {
      user.room();
      System.out.print("Pilih kamar yang tersedia : ");
      x = input.nextInt();
      x = x - 1;

      if (room[x][0] == 1) {
        user.dispPerson();
        System.out.println("No kamar : " + room[x][1]);
        System.out.println("Harga kamar : " + room[x][2]);
        user.doPayment(x);

        break;
      } else {
        System.out.println("Room tidak tersedia");
        System.out.println("Ingin memesan kamar lagi? 0/1 : ");
        z = input.nextInt();
      }
    } while (z == 0);
  }

  public void init() {
    user.setNama(nama);
    user.setEmail(email);
    user.setNoTelp(noTelp);
    user.setAlamat(alamat);
  }

  public void dispPerson() {
    System.out.println("=========================");
    System.out.println("Pembayaran Kamar");
    user.getNama();
    user.getEmail();
    user.getNoTelp();
    user.getAlamat();
  }

  public String getNama() {
    System.out.println("Nama : " + nama);
    return this.nama;
  }

  public String setNama(String nama) {
    System.out.print("Masukkan Nama : ");
    nama = input.nextLine();
    if (!nama.matches("[a-zA-Z_]+")) {
      System.out.println("Invalid name");
      return setNama(nama);
    }

    this.nama = nama;
    return nama;
  }

  public String getEmail() {
    System.out.println("Email : " + email);
    return this.email;
  }

  public String setEmail(String email) {
    System.out.print("Masukkan Email : ");
    email = input.nextLine();
    if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
      System.out.println("Invalid email");
      return setEmail(email);
    }
    this.email = email;

    return email;
  }

  public String getNoTelp() {
    System.out.println("No Telp : " + noTelp);
    return this.noTelp;
  }

  public String setNoTelp(String noTelp) {
    System.out.print("Masukkan No Telp (+62) : ");
    noTelp = input.nextLine();
    if (!noTelp.matches("^(\\+\\d[62]( )?)?\\d{10,11}[- .]?$")) {
      System.out.println("Invalid phone number ");
      return user.setNoTelp(noTelp);
    }

    this.noTelp = noTelp;
    return noTelp;
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
