function isSubsequence(s: string, t: string): boolean {
  const ss = s.split("");
  const ts = t.split("");
  let k = 0;
  let slength = ss.length;
  if (slength == 0) return true;
  outer: for (let i = 0; i < slength; i++) {
    for (let j = k; j < ts.length; j++) {
      if (ss[i] == ts[j]) {
        k = j + 1;
        if (i == slength - 1) {
          return true;
        }
        continue outer;
      }
    }
    return false;
  }
  return false;
}
