function isValid(s: string): boolean {
  let marus = new Array<number>();
  let kakus = new Array<number>();
  let namis = new Array<number>();

  const ss = s.split("");
  for (let char of ss) {
    if (char == "(") marus.push(1);
    if (char == "[") kakus.push(1);
    if (char == "{") namis.push(1);

    if (char == ")") {
      if (marus.length === 0) return false;
      marus.pop();
    }
    if (char == "]") {
      if (kakus.length === 0) return false;
      kakus.pop();
    }
    if (char == "}") {
      if (namis.length === 0) return false;
      namis.pop();
    }
  }
  if (marus.length === 0 && kakus.length === 0 && namis.length === 0)
    return true;
  return false;
}
