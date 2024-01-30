package jp.ac.uryukyu.e235707;

/**
 * よぷよぷクラス。
 * String yopu; //よぷの名前
 */
public class Yopuyopu {

    String yopu;
    
    public Yopuyopu(String yopu){
       this.yopu = yopu;
    }

    /**
     * よぷの生成をアナウンスするメソッド。
     * 赤よぷを生成。
     */
    public void yopu(){
            System.out.println("赤よぷが降ってきた");
            yopu = "赤よぷ";
    }
}

