import java.util.*;
import java.util.stream.*;

/**
 * 最大公約数を求める
 **/
public class GreatestCommonDivisor {
  public static void main(String[] args) {
    // input
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    var aList = hoge(a);
    var bList = hoge(b);

  }

  // 約数のリストを求める
  private static List<Integer> hoge(int num) {
    var retList = new ArrayList<Integer>();

    // num 以下の数字でひたすら余りが0のものを返せばいい
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        retList.add(i);
        System.out.println(i);
      }
    }
    return retList;
  }

}
