package p001;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int search = target - nums[i];
      if (hMap.containsKey(search)) {
        return new int[] {hMap.get(search), i};
      }
      hMap.put(nums[i], i);
    }

    return null;
  }
}
