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

    System.out.println(gcd(a, b));
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }

}
