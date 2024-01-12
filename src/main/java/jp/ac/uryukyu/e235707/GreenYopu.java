package main.java.jp.ac.uryukyu.e235707;

public class GreenYopu extends Yopuyopu{
    
    public GreenYopu(String yopu){
        super(yopu);
    }

    @Override
    //オーバーライドし、緑よぷを召喚する
    public void yopu(){
        System.out.println("緑よぷが降ってきた");
        yopu = "緑よぷ";
        
    }
}
