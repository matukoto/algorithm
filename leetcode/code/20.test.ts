import { describe, expect, it } from "vitest";
import { isValid } from "./20.valid-parentheses.ts";

describe("hoge", () => {
  it("順番も正確である必要がある", () => {
    expect(isValid("[{]}")).toBeFalsy();
  });
  it("順番も正確である必要がある2", () => {
    expect(isValid("[]")).toBeTruthy();
  });
  it("順番も正確である必要がある3", () => {
    expect(isValid("{[]}")).toBeTruthy();
  });
});
