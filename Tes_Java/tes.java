package Tes_Java;
public class tes{
    
   
    String name;
    int speed;
    int healthPoin;

   
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }


    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
}