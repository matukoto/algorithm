import { describe, it, expect } from "vitest";
import { twoSum } from "./1.two-sum.ts";

describe("two-sum", () => {
  it("シンプル 2つの要素がそのまま答えになる", () => {
    expect(twoSum([2, 7], 9)).toEqual([0, 1]);
  });
  it("例題1 最初の2つの要素が答え", () => {
    expect(twoSum([2, 7, 11, 15], 9)).toEqual([0, 1]);
  });
  it("例題2 最初の2つ以外が答え", () => {
    expect(twoSum([3, 2, 4], 6)).toEqual([1, 2]);
  });
  it("例題3 同じ値でも同じ要素を参照しないチェック", () => {
    expect(twoSum([3, 3], 6)).toEqual([0, 1]);
  });
});
