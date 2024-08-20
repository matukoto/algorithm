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

    sc.close();
  }
}
