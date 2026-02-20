import java.time.*;

public class Main {
  void main() {
    // LocalDateTimeの生成方法
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2026, 1, 2, 3, 4, 0, 0);

    // LocalDateTimeとZoneDateTimeの相互変換
    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z1.toLocalDateTime();
  }
}