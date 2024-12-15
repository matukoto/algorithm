// import { ListNode } from "./141.test.ts";
//
// export //
function hasCycle(head: ListNode | null): boolean {
  let fast = head;
  let slow = head;
  while (fast != null) {
    if (fast.next === null) return false;
    fast = fast.next.next;
    slow = slow.next;
    if (fast === slow) return true;
  }
  return false;
}
