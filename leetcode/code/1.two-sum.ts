export //
function twoSum(nums: number[], target: number): number[] {
  for (let i = 0; i < nums.length; i++) {
    const diff = difference(nums[i], target);
    // console.log(`diff=${diff}`);

    for (let j = i + 1; j < nums.length; j++) {
      // console.log(`j=${nums[j]}`);
      if (nums[j] == diff) {
        return [i, j];
      }
    }
  }
  return [];
}

const difference = (num1: number, target: number): number => {
  return target - num1;
};
