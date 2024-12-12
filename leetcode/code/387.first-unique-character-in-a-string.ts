function firstUniqChar(s: string): number {
  const ss = s.split("");

  let tyofukus: Array<string> = [];
  outer: for (let i = 0; i < ss.length; i++) {
    if (tyofukus.includes(ss[i])) {
      continue;
    }
    for (let j = i + 1; j < ss.length; j++) {
      if (ss[i] == ss[j]) {
        tyofukus.push(ss[i]);
        continue outer;
      }
    }
    return i;
  }

  return -1;
}
