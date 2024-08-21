package com.argo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertionSort {
  public static void main(String[] args) throws Exception {
    // 標準入力を取得
    Scanner sc = new Scanner(System.in);

    // ループ回数を取得
    int loopNumber = sc.nextInt();

    // 数字の並びを配列に格納
    List<Integer> trumpList = new ArrayList<>();
    for (int i = 0; i < loopNumber; i++) {
      trumpList.add(sc.nextInt());
    }

    // 入力直後の並びを出力する
    System.out.println(trumpList.stream().map(String::valueOf).collect(Collectors.joining(" ")));

    for (int i = 0; i < loopNumber - 1; i++) {
      // TODO 何らかの並び換えの処理
      int previousNum = trumpList.get(i + 1);

      for (int j = 0; j < i; j++) {
        if (trumpList.get(j) > trumpList.get(j + 1)) {
          // 比較して大きければ順番を入れ替える
          trumpList.set(j + 1, trumpList.get(i));
          trumpList.set(j, previousNum);
        }
      }

      // 並び換え終了後の並びを出力
      System.out.println(trumpList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    sc.close();
  }
}
