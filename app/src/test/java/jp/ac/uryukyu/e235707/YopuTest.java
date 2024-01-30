package jp.ac.uryukyu.e235707;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

public class YopuTest {
    @Test
    public void testYopu(){
        String testColor = "赤よぷ";
        Random random = new Random();
        int randomyopu = random.nextInt(3);
        if (randomyopu == 0) {
            RedYopu red = new RedYopu("赤よぷ");
            red.yopu();
            assertEquals(testColor,red.yopu);
        }else{
            System.out.println("赤よぷではありません");
        }
    }
}
