import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Your KthLargest object will be instantiated and called as such: var obj = new KthLargest(k, nums)
 * var param_1 = obj.add(val)<br>
 * 最初の数字の順位の番号を返す問題。 どんどん追加されていくのでそれを都度ソートする
 */
class KthLargest {

  private int k;
  private List<Integer> numList;

  KthLargest(int k, int[] nums) {
    this.k = k;
    this.numList = Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
  }

  /*
   * ソートして、x番目の数字を返す
   */
  public int add(int val) {
    numList.add(val);
    numList.sort(Collections.reverseOrder());
    return numList.get(k - 1);
  }
}
