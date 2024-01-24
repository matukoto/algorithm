import java.util.*;
import java.util.stream.Collectors;

public class lesson1 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> inputList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      inputList.add(num);
    }

    String joinList1 = inputList.stream().map(String::valueOf).collect(Collectors.joining(" "));
    System.out.println(joinList1);
    for (int i = 1; i < N; i++) {
      int j = i - 1;
      int targetNum = inputList.get(i);
      while (inputList.get(j + 1) < inputList.get(j)) {
        inputList.set(j + 1, inputList.get(j));
        inputList.set(j, targetNum);
        if (j > 0) {
          j--;
        }
      }

      String joinList = inputList.stream().map(String::valueOf).collect(Collectors.joining(" "));
      System.out.println(joinList);
    }

    sc.close();
  }
}
