import { describe, expect, it } from "vitest";
import { isSubsequence } from "./392.is-subsequence.ts";

describe("hoge", () => {
  it("デフォルトでfalseを返す", () => {
    expect(isSubsequence("aa", "bb")).toBeFalsy();
  });
  it("trueを返す", () => {
    expect(isSubsequence("a", "aa")).toBeTruthy();
  });
  it("部分列の一致でtrueを返す", () => {
    expect(isSubsequence("abc", "ahbgdc")).toBeTruthy();
  });
  it("部分列の不一致でfalseを返す", () => {
    expect(isSubsequence("axc", "ahbgdc")).toBeFalsy();
  });
});
