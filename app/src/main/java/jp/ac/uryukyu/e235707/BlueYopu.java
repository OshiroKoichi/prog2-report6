package jp.ac.uryukyu.e235707;

/**
 * 青よぷクラス。
 * 　String yopu; //よぷの名前
 */
public class BlueYopu extends Yopuyopu {

    public BlueYopu(String yopu){
        super(yopu);
    }

    @Override
    /**
     * オーバーライドし、yopuの名前を青よぷに変更。
     */
    public void yopu(){
            System.out.println(yopu + "が降ってきた");
    }
}
