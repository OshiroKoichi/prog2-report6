package main.java.jp.ac.uryukyu.e235707;

public class GreenYopu extends Yopuyopu{
    
    public GreenYopu(String yopu){
        super(yopu);
    }

    @Override
    public void yopu(){
        if(randomyopu == 2){
            System.out.println("緑よぷが降ってきた");
            yopu = "緑yopu";
        }
    }
}
