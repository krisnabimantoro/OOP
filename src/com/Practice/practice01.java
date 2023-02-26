// Krisna Bimantoro - 202210370311254

package com.Practice;

public class practice01 {
    
    public static void main(String[] args) {
        System.out.println("Hello World");

        user u = new user();

        u.name = "Krisna";
        u.Membership = "Gold";

        user u2 = new user();

        u2.name = "Yuning";
        u2.Membership = "Platinum";
        
        System.out.println(u.name);
        System.out.println(u2.name);
    }
}
