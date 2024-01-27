import java.util.*;

/**
 * 最大公約数を求める
 **/
public class GreatestCommonDivisor {
  public static void main(String[] args) {
    // input
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    var aList = hoge(a);
    var bList = hoge(b);

    // 最大公約数の候補リストを作成する
    FOR: for (int targetA : aList) {
      for (int targetB : bList) {
        if (targetA > targetB) {
          break;
        }
        if (targetA == targetB) {
          System.out.println(targetA);
          break FOR;
        }
      }
    }

  }

  // 約数のリストを求める (大きい順)
  private static List<Integer> hoge(int num) {
    var retList = new ArrayList<Integer>();

    // num 以下の数字でひたすら余りが0のものを返せばいい
    for (int i = num; i > 0; i--) {
      if (num % i == 0) {
        retList.add(i);
      }
    }
    return retList;
  }

}
