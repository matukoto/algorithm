package p001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * SolutionTest
 *
 * [1] Two Sum is on the run...
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target .
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * 
 * You can return the answer in any order.
 * 
 *   Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] +
 * nums[1] == 9, we return [0, 1].
 * 
 * 
 * Example 2: Input: nums = [3,2,4], target = 6 Output: [1,2]
 * 
 * 
 * Example 3: Input: nums = [3,3], target = 6 Output: [0,1]
 * 
 * 
 *   Constraints: 2 <= nums.length <= 10⁴ -10⁹ <= nums[i] <= 10⁹ -10⁹ <= target <= 10⁹ Only one
 * valid answer exists.   Follow-up: Can you come up with an algorithm that is less than O(n²) time
 * complexity?
 *
 * [2,7,11,15] 9 [3,2,4] 6 [3,3] 6
 */
public class SolutionTest {

  Solution s = new Solution();

  @Test
  public void sample1() {
    assertArrayEquals(new int[] {0, 1}, s.twoSum(new int[] {2, 7, 11, 15}, 9));
  }

  @Test
  public void sample2() {
    assertArrayEquals(new int[] {1, 2}, s.twoSum(new int[] {3, 2, 4}, 6));
  }

  @Test
  public void sample3() {
    assertArrayEquals(new int[] {0, 1}, s.twoSum(new int[] {3, 3}, 6));
  }
}
