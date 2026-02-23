import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  void main() {
    LocalDate now = LocalDate.now();
    LocalDate future = now.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    IO.println(future.format(fmt));
  }
}
/*
  7行目で、100日後の日付を求めるためにplusDaysメソッドを利用している部分は、
  次のようにPeriodを用いてもよいでしょう。
  LocalDate future = now.plus(Period.ofDays(100));
*/