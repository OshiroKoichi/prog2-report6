package jp.ac.uryukyu.e235707;

/**
 * 緑よぷクラス。
 * String yopu; //よぷの名前
 */
public class GreenYopu extends Yopuyopu{
    
    public GreenYopu(String yopu){
        super(yopu);
    }

    @Override
    /**
     * オーバーライドし、yopuの名前を緑よぷに変更。
     */
    public void yopu(){
          System.out.println("緑よぷが降ってきた");
          yopu = "緑よぷ";
    }
}
