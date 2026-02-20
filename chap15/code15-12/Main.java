import java.util.*;

public class Main {
  void main() {
    Calendar c = Calendar.getInstance();
    // 6つのint値からDateインスタンスを生成
    c.set(2026, 6, 21, 9, 0, 0);
    c.set(Calendar.MONTH, 9);     /* 月を9（10月）に変更 */
    Date d = c.getTime();
    IO.println(d);
    // Dateインスタンスからint値を生成
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);  /* 年を取り出す */
    IO.println("今年は" + y + "年です");
  }
}