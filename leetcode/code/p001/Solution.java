package p001;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      // System.out.println(i + "is" + nums[i]);
      for (int j = i + 1; j < nums.length; j++) {
        // System.out.println(j + "js" + nums[j]);
        if ((nums[j] + nums[i]) == target) {
          // System.out.println(i + "and" + j);
          return new int[] {i, j};
        }
      }
    }
    return null;
  }
}
