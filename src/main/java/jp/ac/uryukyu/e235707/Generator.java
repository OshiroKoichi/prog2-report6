package main.java.jp.ac.uryukyu.e235707;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Generator {
    private ArrayList<int[]> coordinates = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
    private ArrayList<Integer> myList = new ArrayList<>();

    public Generator() {
        // 5x5のマスを表現するArrayListのArrayListを作成
        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                row.add(0);  // 0で初期化 (例: 赤: 1, 青: 2, 緑: 3)
            }
            grid.add(row);
        }
    }

    public void coordinate() {
        Scanner scannerx = new Scanner(System.in);
        System.out.println("x座標の位置を指定してください(0~4)");
        int userInputx = scannerx.nextInt();

        Scanner scannery = new Scanner(System.in);
        System.out.println("y座標の位置を指定してください(0~4)");
        int userInputy = scannery.nextInt();

        generate(); // 新しい整数（色）を生成
        coordinates.add(new int[]{userInputx, userInputy});

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

        System.out.println("マスの内容:");
        for (ArrayList<Integer> row : grid) {
            for (Integer cell : row) {
                System.out.print(getColor(cell) + "\t");  // 整数に対応する色を表示
            }
            System.out.println();
        }
    }

    private void generate() {
        Random random = new Random();
        int randomyopu = random.nextInt(3);
        if (randomyopu == 0) {
            myList.add(1); // 赤: 1
        } else if (randomyopu == 1) {
            myList.add(2); // 青: 2
        } else if (randomyopu == 2) {
            myList.add(3); // 緑: 3
        }
    }

    private String getColor(int number) {
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
}
