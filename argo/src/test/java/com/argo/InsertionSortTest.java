package com.argo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.util.StandardInputStream;
import com.util.StandardOutputStream;

/** Lesson1Test */
public class InsertionSortTest {

  private StandardInputStream in = new StandardInputStream();
  private StandardOutputStream out = new StandardOutputStream();
  private InsertionSort sort = new InsertionSort();

  @BeforeEach
  public void setup() {
    System.setIn(in);
    System.setOut(out);
  }

  @AfterEach
  public void tearDown() {
    System.setIn(null);
    System.setOut(null);
  }

  @Test
  public void 指定した回数forループする() throws Exception {

    // INPUT
    in.inputln("6");
    // テストメソッド対象実行
    sort.main(null);
    // 期待値チェック
    assertEquals("6", out.readLine());
  }

  /**
   * 最終的に成功して欲しいテスト <br>
   * これが成功すればいったんアルゴリズムOKとして良し。
   */
  // @Test
  // public void test最後にチェック() {
  // in.inputln("6");
  // in.inputln("5 2 4 6 1 3");
  // try {
  // Lesson1.main(null);
  // } catch (Exception e) {
  // e.printStackTrace();
  // }
  // assertEquals("5 2 4 6 1 3", out.readLine());
  // assertEquals("2 5 4 6 1 3", out.readLine());
  // assertEquals("2 4 5 6 1 3", out.readLine());
  // assertEquals("2 4 5 6 1 3", out.readLine());
  // assertEquals("1 2 4 5 6 3", out.readLine());
  // assertEquals("1 2 3 4 5 6", out.readLine());
  // }
}
