import { describe, expect, it } from "vitest";
import { KthLargest } from "./703.kth-largest-element-in-a-stream.ts";

describe("hoge", () => {
  it("huga", () => {
    const kthLargest = new KthLargest(1, [1, 2]);
    expect(kthLargest.add(2)).toBe(2);
  });
});
