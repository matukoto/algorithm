package com.argo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  // 準備
  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void _1という数字が入ってきたら1を出力する() {
    // 下から埋めていく (今回の例だと検証から)
    // 実行
    String actual = fizzBuzz.execute(1);
    // 検証
    assertEquals("1", actual);
  }


  @Test
  public void _2という数字が入ってきたら2を出力する() {
    // 実行
    String actual = fizzBuzz.execute(2);
    // 検証
    assertEquals("2", actual);
  }

  @Test
  public void _3のときはFizzと出力する() {
    // 実行
    String actual = fizzBuzz.execute(3);
    // 検証
    assertEquals("Fizz", actual);
  }

  @Test
  public void _5のときはBuzzと出力する() {
    // 実行
    String actual = fizzBuzz.execute(5);
    // 検証
    assertEquals("Buzz", actual);
  }
}
