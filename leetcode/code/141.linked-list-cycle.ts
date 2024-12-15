//export
function hasCycle(head: ListNode | null): boolean {
  if (head === null) {
    return false;
  }
  let nodeMap = new Map<ListNode, number>();
  let mapsize = 0;

  while (head.next != null) {
    nodeMap.set(head, 1);
    if (nodeMap.size === mapsize) {
      return true;
    }
    head = head.next;
    mapsize++;
  }
  return false;
}

// export
// class ListNode {
//   val: number;
//   next: ListNode | null;
//   constructor(val?: number, next?: ListNode | null) {
//     this.val = val === undefined ? 0 : val;
//     this.next = next === undefined ? null : next;
//   }
// }
