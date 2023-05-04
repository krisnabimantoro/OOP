//Krisna ganteng - 254
package com.Praktikum.Modul_3.Tugas;

import java.util.*;

public class user {

  private String namaUser;
  private String passwordUser;
  private int roleUser;
  private boolean statusUser;

  private boolean admin;
  private int userIndex;
  private Object[][] userDB;

  Scanner sc = new Scanner(System.in);

  static user obj = new user();

  public void sql() {
    userDB =
      new Object[][] {
        { "admin", "admin", 0, true },
        { "202110370311147", "UMM_a2021", 1, true },
        { "202110370311145", "UMM_a2021", 1, false },
        { "a", "1", 1, true },
        { "b", "1", 1, false },
      };
  }

  public static void main(String[] args) {
    obj.sql();
    obj.login();
  }

  public void login() {
    System.out.print("\nMasukkan Username : ");
    obj.setNamaUser(namaUser = sc.next());

    System.out.print("Masukkan Password : ");
    obj.setPasswordUser(passwordUser = sc.next());
    obj.dashboard();
    
  }

  public void dashboard() {
    int x;

    for (int i = 0; i < userDB.length; i++) {
      if (
        obj.getNamaUser().equals(obj.getUserDB()[i][0]) &&
        obj.getPasswordUser().equals(obj.getUserDB()[i][1]) &&
        obj.getUserDB()[i][2].equals(0)
      ) {
        obj.setAdmin(admin = true);
        System.out.println("\nSistem Akademik UMM | Admin");

        System.out.println("1. Update Status Mahasiswa");
        System.out.println("2. Update Password Mahasiswa");
        System.out.println("0. Logout");
        System.out.print("Pilih menu : ");
        x = sc.nextInt();

        if (x == 1) {
          obj.updateStatus();
        } else if (x == 2) {
          obj.adminPassword();
        } else {
          obj.login();
        }
      } else if (
        obj.getNamaUser().equals(obj.getUserDB()[i][0]) &&
        obj.getPasswordUser().equals(obj.getUserDB()[i][1]) &&
        obj.getUserDB()[i][2].equals(1)
      ) {
        obj.setAdmin(admin = false);
        obj.setUserIndex(i);

        System.out.println("\nSistem Akademik UMM | Mahasiswa");
        System.out.println("Username : " + obj.getNamaUser());
        System.out.println("Status Mahasiswa : " + obj.getUserDB()[i][3]);
        System.out.println("1. Update Password");
        System.out.println("0. Logout");
        System.out.print("Pilih menu : ");
        x = sc.nextInt();

        if (x == 1) {
          obj.updatePassword();
        } else {
          obj.login();
        }
      }
    }

    System.out.println("Username atau password salah, silahkan ulangi\n");
    obj.login();
  }

  public void updatePassword() {
    int x;
    System.out.print("\nInput Password Baru : ");

    obj.setPasswordUser(passwordUser = sc.next());

    if (obj.isPassUpperCase(passwordUser) == true) {
      if (obj.isPassLowerCase(passwordUser) == true) {
        if (obj.isPassDigit(passwordUser) == true) {
          if (obj.isPassSymbols(passwordUser) == true) {
            userDB[obj.getUserIndex()][1] = obj.getPasswordUser();
            obj.setUserDB(userDB);

            if (obj.getAdmin() == true) {
              System.out.println("Password berhasil di update, pilih menu ");
              System.out.print("Ketik 1 untuk ulangi dan 0 untuk logout : ");
              x = sc.nextInt();
              if (x == 1) {
                obj.adminPassword();
              } else if (x == 0) {
                obj.login();
              }
            } else {
              System.out.println(
                "Password berhasil diupdate, silahkan login kembali"
              );
              obj.login();
            }
          }
        }
      }
    }
  }

  public boolean isPassSymbols(String passwordUser) {
    if (obj.getPasswordUser().matches(".*[!@#$%^&*(),.?\":{}|<>_/].*")) {
      this.passwordUser = passwordUser;
      return true;
    } else {
      System.out.println("Password harus memiliki Symbol");
      obj.updatePassword();
      return false;
    }
  }

  public boolean isPassDigit(String passwordUser) {
    if (obj.getPasswordUser().matches(".*[0-9].*")) {
      this.passwordUser = passwordUser;
      return true;
    } else {
      System.out.println("Password harus memiliki Digit");
      obj.updatePassword();
      return false;
    }
  }

  public boolean isPassLowerCase(String passwordUser) {
    if (obj.getPasswordUser().matches(".*[a-z].*")) {
      this.passwordUser = passwordUser;
      return true;
    } else {
      System.out.println("Password harus memiliki lowercase");
      obj.updatePassword();
      return false;
    }
  }

  public boolean isPassUpperCase(String passwordUser) {
    if (obj.getPasswordUser().matches(".*[A-Z].*")) {
      this.passwordUser = passwordUser;
      return true;
    } else {
      System.out.println("Password harus memiliki uppercase");
      obj.updatePassword();
      return false;
    }
  }

  public void adminPassword() {
    int y;
    System.out.println("\nUsername dan Password Mahasiswa : ");

    for (int i = 1; i < userDB.length; i++) {
      System.out.print(i + ". ");
      System.out.print(obj.getUserDB()[i][0]);
      System.out.println("  -  " + obj.getUserDB()[i][1]);
    }
    System.out.print("Pilih Mahasiswa : ");
    y = sc.nextInt();
    if (y <= userDB.length - 1) {
      obj.setUserIndex(y);
      obj.updatePassword();
    } else {
      System.out.println("Username tidak tersedia, silahkan pilih kembali");
      obj.adminPassword();
    }
  }

  public void updateStatus() {
    int x, y;
    System.out.println("\nUsername dan Status Mahasiswa : ");

    for (int i = 1; i < userDB.length; i++) {
      System.out.print(i + ". ");
      System.out.print(obj.getUserDB()[i][0]);
      System.out.println("  -  " + obj.getUserDB()[i][3]);
    }

    System.out.print("Pilih mahasiswa : ");
    x = sc.nextInt();

    if (x <= userDB.length - 1) {
      if (obj.getUserDB()[x][3].equals(true)) {
        userDB[x][3] = false;
        obj.setUserDB(userDB);
        System.out.println("Status Mahasiswa telah di update");

        System.out.print("Ketik 1 untuk ulangi dan 0 untuk logout : ");
        y = sc.nextInt();
        if (y == 1) {
          obj.updateStatus();
        } else if (y == 0) {
          obj.login();
        }
      } else if (obj.getUserDB()[x][3].equals(false)) {
        userDB[x][3] = true;
        obj.setUserDB(userDB);
        System.out.println("Status Mahasiswa telah di update");

        System.out.print("Ketik 1 untuk ulangi dan 0 untuk logout : ");
        y = sc.nextInt();
        if (y == 1) {
          obj.updateStatus();
        } else if (y == 0) {
          obj.login();
        }
      }

      obj.login();
    } else {
      System.out.println("Username tidak tersedia, silahkan pilih kembali");
      obj.updateStatus();
    }
  }

  public String getNamaUser() {
    return this.namaUser;
  }

  public void setNamaUser(String namaUser) {
    this.namaUser = namaUser;
  }

  public String getPasswordUser() {
    return this.passwordUser;
  }

  public void setPasswordUser(String passwordUser) {
    this.passwordUser = passwordUser;
  }

  public int getRoleUser() {
    return this.roleUser;
  }

  public void setRoleUser(int roleUser) {
    this.roleUser = roleUser;
  }

  public boolean isStatusUser() {
    return this.statusUser;
  }

  public boolean getStatusUser() {
    return this.statusUser;
  }

  public void setStatusUser(boolean statusUser) {
    this.statusUser = statusUser;
  }

  public boolean isAdmin() {
    return this.admin;
  }

  public boolean getAdmin() {
    return this.admin;
  }

  public void setAdmin(boolean admin) {
    admin = this.admin = admin;
  }

  public int getUserIndex() {
    return this.userIndex;
  }

  public void setUserIndex(int userIndex) {
    this.userIndex = userIndex;
  }

  public Object[][] getUserDB() {
    return this.userDB;
  }

  public void setUserDB(Object[][] userDB) {
    this.userDB = userDB;
  }
}
