public class Printer {
  public void printAnything(Object o) {
    // どんな型のインスタンスでも受け取って画面に表示
    IO.println(o.toString());
  }
}