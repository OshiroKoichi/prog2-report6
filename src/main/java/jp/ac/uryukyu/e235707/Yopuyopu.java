package main.java.jp.ac.uryukyu.e235707;

import java.util.Random;

import java.util.Scanner;

public class Yopuyopu {

    public String yopu;
    int randomyopu;
    
    public Yopuyopu(String yopu){
       this.yopu = yopu;
    }

    public int yopu(){
        Random random = new Random();
        int randomyopu = random.nextInt(3);
        System.out.println(randomyopu);
        return randomyopu;
    }

    public String yopuColer(){
        if (randomyopu == 0){
            System.out.println("よぷが降ってきた");
            yopu = "よぷ";
        }else{
            System.out.println("yopu");
            yopu = "yopu";
        }
        return yopu;
    }

    public void fall(String yopu){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ここに落としますか？(yes/no):");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("yes")){
                System.out.println(yopu + "を落とした");
            }else if(userInput.equals("no")){
                System.out.println("移動して落とします");
            }
            scanner.close();
    }
}

