import { describe, expect, it } from "vitest";
import { ListNode, hasCycle } from "./141.linked-list-cycle.ts";

describe("ケース例", () => {
  it("1", () => {
    // ノードを作成
    const node1 = new ListNode(3);
    const node2 = new ListNode(2);
    const node3 = new ListNode(0);
    const node4 = new ListNode(-4);

    // ノードをリンク
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node2;

    expect(hasCycle(node1)).toBeTruthy();
  });
  it("2", () => {
    // ノードを作成
    const node1 = new ListNode(1);
    const node2 = new ListNode(2);

    // ノードをリンク
    node1.next = node2;
    node2.next = node1;

    expect(hasCycle(node1)).toBeTruthy();
  });
  it("3", () => {
    const node1 = new ListNode(1);
    node1.next = null;
    expect(hasCycle(node1)).toBeFalsy();
  });
});
describe("false", () => {
  it("headがnull", () => {
    const node1 = null;
    expect(hasCycle(node1)).toBeFalsy();
  });
  it("nextがnull", () => {
    const node1 = new ListNode(1);
    node1.next = null;
    expect(hasCycle(node1)).toBeFalsy();
  });
});
