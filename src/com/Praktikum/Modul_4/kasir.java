package com.Praktikum.Modul_4;

import java.time.LocalDate;
import java.util.*;

public class kasir {

  public static double currentPrice;
  public static double currentDiscount;
  public static double total;
  public Voucher[] vouchers;

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    kasir obj = new kasir();
    obj.addPrice(currentPrice);
    obj.addVoucher(null);
    obj.addDisc(currentDiscount);
    obj.setTotal(total);
    obj.getTotal();
  }

  public void addPrice(double price) {
    System.out.println("\nHarga belanja = " + currentPrice);
  }

  public void addDisc(double disc) {
    currentDiscount = currentPrice * currentDiscount;

    System.out.println("Total diskon = " + currentDiscount);
  }

  public void addVoucher(String code) {
    LocalDate today = LocalDate.of(2023, 5, 12);
    Voucher vouchers = new Voucher("2022", today, 0.25);

    String x;
    System.out.print("Masukkan kode voucher jika ada : ");
    x = sc.next();
    if (x.equals(vouchers.getCode()) && vouchers.isValid()) {
      System.out.println(
        "Voucher berhasil ditambahkan sebesar " +
        vouchers.getDiscount() *
        100 +
        "%"
      );
      currentDiscount = currentDiscount + vouchers.getDiscount();
    }else{
      System.out.println("Voucher tidak valid atau sudah kadaluwarsa");
    }
  }

  public double getTotal() {
    System.out.println("Total Belanja =" + total);

    return total;
  }

  public void setTotal(double total) {
    total = currentPrice - currentDiscount;
    kasir.total = total;
  }
}

class Voucher {

  public String code;
  public LocalDate validUntil;
  public double discount;

  public Voucher(String code, LocalDate validUntil, double discount) {
    this.code = code;
    this.validUntil = validUntil;
    this.discount = discount;
  }

  public String getCode() {
    return this.code;
  }

  public LocalDate getValidUntil() {
    return this.validUntil;
  }

  public double getDiscount() {
    return this.discount;
  }

  public boolean isValid() {
    LocalDate today = LocalDate.now();
    if (validUntil.compareTo(today) >= 0) {
      return true;
    } else {
      
      return false;
    }
  }
}
