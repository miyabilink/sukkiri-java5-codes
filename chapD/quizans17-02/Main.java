public class Main {
  void main() {
    try {
      String s = null;
      IO.println(s.length());
    } catch (NullPointerException e) {
      IO.println("NullPointerException例外をcatchしました");
      IO.println("ーースタックトレース（ここから）ーー");
      e.printStackTrace();
      IO.println("ーースタックトレース（ここまで）ーー");
    }
  }
}