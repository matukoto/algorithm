package com.argo;

import java.util.Scanner;

/** 最大公約数を求める */
public class GreatestCommonDivisor {
  public static void main(String[] args) {
    // input
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    System.out.println(gcd(a, b));
  }

  // hint x と y の最大公約数は x % y と y の最大公約数に等しい
  // -> これをひたすら繰り返す
  // -> x % y = 0 となるとき、すなわち余りが0となるとき、その一つ前の数字が最大公約数である
  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }
}
