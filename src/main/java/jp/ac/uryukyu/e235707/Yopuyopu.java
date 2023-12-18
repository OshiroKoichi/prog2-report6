package main.java.jp.ac.uryukyu.e235707;

import java.util.Scanner;

import java.util.ArrayList;

public class Yopuyopu {

    String yopu;
    int randomyopu;
    ArrayList<String> gameScreen = new ArrayList<>();
    
    public Yopuyopu(String yopu){
       this.yopu = yopu;
    }

    public void yopu(){
        if (randomyopu == 0){
            System.out.println("赤よぷが降ってきた");
            yopu = "赤よぷ";
        }
    }

    public void fall(){
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

