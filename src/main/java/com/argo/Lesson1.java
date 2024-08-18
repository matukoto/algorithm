package com.argo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lesson1 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> inputList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      inputList.add(num);
    }

    System.out.println(inputList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    for (int i = 1; i < N; i++) {
      int j = i - 1;
      int targetNum = inputList.get(i);

      while (j >= 0 && inputList.get(j) > targetNum) {
        inputList.set(j + 1, inputList.get(j));
        j--;
      }

      inputList.set(j + 1, targetNum);
      System.out.println(inputList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    sc.close();
  }
}
