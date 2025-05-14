/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = new KthLargest(k, nums)
 * var param_1 = obj.add(val)
 * 最初の数字の順位の番号を返す問題。
 * どんどん追加されていくのでそれを都度ソートする
 */
export class KthLargest {
	private k: number;
	private sortedNums: number[];
	constructor(k: number, nums: number[]) {
		this.k = k;
		this.sortedNums = nums;
	}

	add(val: number): number {
		this.sortedNums.push(val);
		this.sortedNums.sort((a, b) => b - a);
		return this.sortedNums[this.k - 1];
	}
}
