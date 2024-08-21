package com.argo;

public class FizzBuzz {

  public String execute(int num) {

    if (num % 3 == 0) {
      return "Fizz";
    }
    return String.valueOf(num);
  }
}
