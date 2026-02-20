import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  void main() throws Exception {
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // 文字列からDateインスタンスを生成
    Date d = f.parse("2026/06/21 09:00:00");
    System.out.println(d);
    // Dateインスタンスから文字列を生成
    Date now = new Date();
    String s = f.format(now);
    IO.println("現在は" + s + "です");
  }
}