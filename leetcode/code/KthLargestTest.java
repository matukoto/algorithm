import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class KthLargestTest {

  @Test
  void return0() {
    KthLargest kthLargest = new KthLargest(1, new int[] {1, 2});
    assertEquals(0, kthLargest.add(0));
  }
  // @Test
  // void sampleCase() {
  // KthLargest kthLargest = new KthLargest(3, new int[] {4, 5, 8, 2});
  //
  // assertEquals(3, kthLargest);
  //
  // assertEquals(4, kthLargest.add(3));
  // assertEquals(5, kthLargest.add(5));
  // assertEquals(5, kthLargest.add(10));
  // assertEquals(8, kthLargest.add(9));
  // assertEquals(8, kthLargest.add(4));
  // }
  //
  // @Test
  // void sampleCase2() {
  // KthLargest kthLargest = new KthLargest(4, new int[] {7, 7, 7, 7, 3});
  //
  //
  // assertEquals(null, kthLargest);
  // assertEquals(7, kthLargest.add(2));
  // assertEquals(7, kthLargest.add(10));
  // assertEquals(7, kthLargest.add(9));
  // assertEquals(8, kthLargest.add(9));
  // }
}
