public class Main {
  void main() {
    try {
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e) {
      IO.println("NumberFormatException例外をcatchしました");
    }
  }
}