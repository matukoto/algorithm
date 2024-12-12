import { describe, expect, it } from "vitest";
import {
  firstUniqChar,
  // createStringList,
} from "./387.first-unique-character-in-a-string.ts";

describe("重複していない最初の文字のindexを返す", () => {
  it("最初の1文字が重複なし", () => {
    expect(firstUniqChar("leetcode")).toBe(0);
  });
  it("3文字目で初めて重複なし", () => {
    expect(firstUniqChar("loveleetcode")).toBe(2);
  });
  it("全て重複していれば-1", () => {
    expect(firstUniqChar("aabb")).toBe(-1);
  });
});

// describe("文字列を分解してリストをつくる", () => {
//   it("huga", () => {
//     expect(createStringList("ll")).toEqual(["l", "l"]);
//   });
// });
