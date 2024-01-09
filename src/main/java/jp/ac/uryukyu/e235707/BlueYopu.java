package main.java.jp.ac.uryukyu.e235707;

public class BlueYopu extends Yopuyopu {

    public BlueYopu(String yopu){
        super(yopu);
    }

    @Override
    public void yopu(){
            System.out.println(yopu + "が降ってきた");
            yopu = "青よぷ";
    }
}
