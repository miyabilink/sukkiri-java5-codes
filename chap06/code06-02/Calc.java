public class Calc {
  void main() {
    int a = 10; int b = 2;
    int total = tasu(a, b);
    int delta = hiku(a, b);
    IO.println("足すと" + total + "、引くと" + delta);
  }

  public static int tasu(int a, int b) {
    return (a + b);
  }

  public static int hiku(int a, int b) {
    return (a - b);
  }
}