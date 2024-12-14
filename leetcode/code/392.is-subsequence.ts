function isSubsequence(s: string, t: string): boolean {
  let sIndex = 0;

  for (let i = 0; i < t.length; i++) {
    if (s[sIndex] === t[i]) {
      sIndex++;
    }
  }

  if (sIndex === s.length) {
    return true;
  }

  return false;
}
