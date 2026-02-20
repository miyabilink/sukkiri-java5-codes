import java.util.Date;

public class Main {
  void main() {
    Date now = new Date();
    IO.println("現在日時は" + now);
    IO.println("long値では" + now.getTime());
    now.setTime(1782000000000L);
    IO.println("指定日時は" + now);
  }
}