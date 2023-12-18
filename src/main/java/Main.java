package main.java;

import main.java.jp.ac.uryukyu.e235707.RedYopu;
import main.java.jp.ac.uryukyu.e235707.Yopuyopu;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Random random = new Random();
       int randomyopu = random.nextInt(3);
        if (randomyopu == 0){
            RedYopu red = new RedYopu("赤よぷ");
        }
        
    }

    
}
