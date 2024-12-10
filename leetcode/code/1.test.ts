import { describe, it, expect } from "vitest";
import { twoSum } from "./1.two-sum.ts";

describe("sum function", () => {
  it("should return 3 when adding 1 and 2", () => {
    expect(twoSum([1, 2], 2)).toStrictEqual([3, 2]);
  });
});
