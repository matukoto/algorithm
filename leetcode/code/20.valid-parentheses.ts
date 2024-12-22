export function isValid(s: string): boolean {
  const ss = s.split("");
  console.log(ss);
  for (let i = 0; i < ss.length; i++) {
    if (ss[i - 1] === "(" && ss[i] === ")") {
      ss.splice(i - 1, 2);
    }
    if (ss[i - 1] === "{" && ss[i] === "}") {
      ss.splice(i - 1, 2);
    }
    if (ss[i - 1] === "[" && ss[i] === "]") {
      ss.splice(i - 1, 2);
    }
    if (ss[i] === "(" && ss[i + 1] === ")") {
      ss.splice(i, i + 2);
    }
    if (ss[i] === "[" && ss[i + 1] === "]") {
      ss.splice(i, i + 2);
    }
    if (ss[i] === "{" && ss[i + 1] === "}") {
      ss.splice(i, i + 2);
    }
    console.log(ss);
  }
  if (ss.length === 0) return true;
  return false;
}
