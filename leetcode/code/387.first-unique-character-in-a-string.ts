function firstUniqChar(s: string): number {
  var ss = s.split("");
  var size = ss.length;

  let tyofukus: Array<string> = [];
  outer: for (let i = 0; i < size; i++) {
    if (tyofukus.includes(ss[i])) {
      continue;
    }
    for (let j = i + 1; j < size; j++) {
      if (ss[i] == ss[j]) {
        tyofukus.push(ss[i]);
        continue outer;
      }
    }
    return i;
  }

  return -1;
}
