// 703. Kth Largest

import java.util.PriorityQueue;

/**
 * Your KthLargest object will be instantiated and called as such: var obj = new KthLargest(k, nums)
 * var param_1 = obj.add(val)<br>
 * 第一引数の数字の順位の番号を返す問題。 どんどん追加されていくのでそれを都度ソートする<br>
 * -> これでは時間制限オ-バーになるため、優先度付きキューを使う<br>
 * -> 新しい要素を追加した際に優先度の高いものから出てくるキュー。これを使って一番小さいものを出すことで配列の要素数をk個に維持できる
 */
class KthLargest {

  private int k;
  private PriorityQueue<Integer> pq;


  KthLargest(int k, int[] nums) {
    this.k = k;
    this.pq = new PriorityQueue<>();
    //
    // 全て優先度付きキューに入れる
    for (int i = 0; i < nums.length; i++) {
      pq.offer(nums[i]);
      // キューサイズがk を超えていた場合、最大値を消す
      if (pq.size() > k) {
        pq.poll();
      }
    }
  }

  /*
   * ソートして、x番目の数字優先度付きQで最大値を取り出さずに取得するようなあれはありますか。を返す
   */
  public int add(int val) {
    pq.offer(val);
    if (pq.size() > k) {
      pq.poll();
    }
    return pq.peek();
  }
}
