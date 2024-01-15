package main.java.jp.ac.uryukyu.e235707;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import main.java.jp.ac.uryukyu.e235707.RedYopu;
import main.java.jp.ac.uryukyu.e235707.BlueYopu;
import main.java.jp.ac.uryukyu.e235707.GreenYopu;

public class Generator {
    // 5x5のマスを表現するArrayListのArrayListを作成
    private ArrayList<int[]> coordinates = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
    private ArrayList<Integer> myList = new ArrayList<>();

    public Generator() {
        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                row.add(0);  // 0で初期化 (例: 赤: 1, 青: 2, 緑: 3)
            }
            grid.add(row);
        }
    }

    //ユーザーの入力を受け、マスの内容を表示
    public void coordinate() {
        //x座標の入力
        Scanner scannerx = new Scanner(System.in);
        System.out.println("x座標の位置を指定してください(0~4)");
        int userInputx = scannerx.nextInt();
        //y座標の入力
        Scanner scannery = new Scanner(System.in);
        System.out.println("y座標の位置を指定してください(0~4)");
        int userInputy = scannery.nextInt();

        if (isValue(userInputx) && isValue(userInputy)){
         generate(); // 新しい整数（色）を生成
         System.out.println(" ");
         coordinates.add(new int[]{userInputx, userInputy});

         //マイリストが空でないかを確認・座標に対応する要素を設定
         if (!myList.isEmpty() && coordinates.size() <= grid.size() && grid.get(0).size() >= coordinates.get(0).length) {
            for (int[] coord : coordinates) {
                int x = coord[0];
                int y = coord[1];
                if (x >= 0 && x < grid.size() && y >= 0 && y < grid.get(0).size()) {
                    grid.get(x).set(y, myList.get(myList.size() - 1));
                }
            }
         } else {
            System.out.println("エラー: myListが空でないか、coordinatesのサイズがgridを超えています。");
         }
         printer();//マスの内容表示
        } else{
            System.out.println("入力が範囲外です。プログラムを終了します。");
        }
    }

    //ユーザー入力の範囲を確認
    private static boolean isValue(int input){
        return input >= 0 && input <= 4;
    }

    //よぷを生成し、色分け
    private void generate() {
        Random random = new Random();
        int randomyopu = random.nextInt(3);
        if (randomyopu == 0) {
            RedYopu red = new RedYopu("赤よぷ");
            red.yopu();
            myList.add(1); // 赤: 1
        } else if (randomyopu == 1) {
            BlueYopu blu = new BlueYopu("青よぷ");
            blu.yopu();
            myList.add(2); // 青: 2 
        } else if (randomyopu == 2) {
            GreenYopu gre = new GreenYopu("緑よぷ");
            gre.yopu();
            myList.add(3); // 緑: 3
        }
    }

    //ケースごとに色を割り当て
    private String getcolor(int number) {
        switch (number) {
            case 1:
                return "赤";
            case 2:
                return "青";
            case 3:
                return "緑";
            default:
                return "";
        }
    }

    //マスの内容を表示
    private void printer(){
        System.out.println("マスの内容:");
        for (ArrayList<Integer> row : grid) {
            for (Integer cell : row) {
                System.out.print(getcolor(cell) + "\t");  // 整数に対応する色を表示
            }
            System.out.println();
        }
    }
}
