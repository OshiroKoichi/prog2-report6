package main.java.jp.ac.uryukyu.e235707;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Generator{
    private ArrayList<int[]> coordinates = new ArrayList<>();
    private ArrayList<ArrayList<Object>> grid = new ArrayList<>();
    ArrayList<String> myList = new ArrayList<>();
    public Generator(){
       Random random = new Random();
       int randomyopu = random.nextInt(3);
       generate(randomyopu);
        // 5x5のマスを表現するArrayListのArrayListを作成
        ArrayList<ArrayList<String>> grid = new ArrayList<>();

        // マスの初期化（空文字列で初期化）
        for (int i = 0; i < 5; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                row.add("");  // 空文字列で初期化
            }
            grid.add(row);
        }
    }
    
    public void generate(int randomyopu){
        
    if (randomyopu == 0){
        myList.add("赤");
        RedYopu red = new RedYopu("赤よぷ");
        red.yopu();
        Coordinate();
    }if(randomyopu == 1){
        myList.add("青");
        BlueYopu ble = new BlueYopu("青よぷ");
        ble.yopu();
        Coordinate();
    }if(randomyopu == 2){
        myList.add("緑");
        GreenYopu gle = new GreenYopu("緑よぷ");
        gle.yopu();
        Coordinate();
    }
    }
    
    public void Coordinate(){
        Scanner scannerx = new Scanner(System.in);
        System.out.println("x座標の位置を指定してください(0~4)");
        int userInputx = scannerx.nextInt();

        Scanner scannery = new Scanner(System.in);
        System.out.println("y座標の位置を指定してください(0~4)");
        int userInputy = scannery.nextInt();
        
        coordinates.add(new int[]{userInputx, userInputy});
        for (int[] coord : coordinates) {
            int x = coord[0];
            int y = coord[1];
            if (x >= 0 && x < 5 && y >= 0 && y < 5) {
                grid.get(x).set(y, myList.remove(0));
            }
        }

        System.out.println("マスの内容:");
        for (ArrayList<Object> row : grid) {
            for (Object cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
