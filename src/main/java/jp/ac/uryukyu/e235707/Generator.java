package main.java.jp.ac.uryukyu.e235707;

import java.util.Random;

public class Generator{

    public Generator(){
       Random random = new Random();
       int randomyopu = random.nextInt(3);
       generate(randomyopu);
    }
    
    public void generate(int randomyopu){
    if (randomyopu == 0){
        RedYopu red = new RedYopu("赤よぷ");
        red.yopu();
    }if(randomyopu == 1){
        BlueYopu ble = new BlueYopu("青よぷ");
        ble.yopu();
    }if(randomyopu == 2){
        GreenYopu gle = new GreenYopu("緑よぷ");
        gle.yopu();
    }
    }
}
