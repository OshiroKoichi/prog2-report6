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
            System.out.println("赤よぷが降ってきた");
            yopu = "赤よぷ";
    }
}

