## [60 questions to solve - LeetCode](https://leetcode.com/problem-list/xo2bgr0r/?favoriteSlug=)

### easy からやっていく

- [x] 1. two sum
  - 処理をなるべく for の外に出す
- [x] 387. first unique character in a string
  - なるはやで return する
  - outer continue 最強説
- [x] 392. is subsequence
  - outer continue 最強説
- [x] 141. linked list cycle
  - 連結リストループするやり方なるほど
  - 自力で解けたがフロイドの循環検出法なるもので解いてみる
  - とても簡潔に表現できて、アルゴリズムの美しさを体感した
- [x] 20. valid parentheses
  - {},[],()のペアをmapに保持するっていう発想なかったなあ。スマートすぎる
  - stack.pop() === map.[char] ってできるのか。便利だな

## [Welcome to AOJ | Aizu Online Judge](https://onlinejudge.u-aizu.ac.jp/home)

- 基礎的なアルゴリズムを学ぶ
- [x] JUnit 動くようにする
  - [x] gradle もってくる
- [x] diagnostic を消す

### Java テスト実行

#### leetcode

- 通常実行: `leetcode/` 直下で `./gradlew test`
- 特定テストだけ: `./gradlew test --tests KthLargestTest`
- 変更監視で再実行: `./gradlew test --continuous`
- watch の短縮形: `./gradlew test -t`

### Java

#### 配列： 固定長 array

- array.length
- Arrays.sort(array) // 昇順でソート
- Arrays.fill(array, value) // 全ての要素を value で埋める

#### 可変長配列： ArrayList<E>

- list.add(value)
- list.get(index)
- list.set(index,value)
- list.size()
- Collections.sort(list) // 昇順でソート
- list.sort(null) // 昇順でソート

#### 文字列： String

- str.length()
- str.charAt(index)
- str.substring(start,end)
- str.toCharArray()
- str.equals(otherStr)

#### キュー、スタック ArrayDeque<E>

deque.addLast(value) // キューの末尾に追加
deque.pollFirst() // キューの先頭から要素を取り出し削除する
deque.pollLast() // キューの末尾から要素を取り出し削除する
deque.peekFirst() // キューの先頭の要素を取得（削除しない）
deque.peekLast() // キューの末尾の要素を取得（削除しない）

#### 連想配列 HashMap<K,V>

map.put(key, value) // キーと値のペアを追加
map.get(key) // キーに対応する値を取得
map.getOrDefault(key, defaultValue) // キーに対応する値を取得、キーが存在しない場合は defaultValue を返す
map.containsKey(key) // キーが存在するかどうかを確認
