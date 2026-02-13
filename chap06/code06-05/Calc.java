public class Calc {
  void main() {
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);
    IO.println("足すと" + total + "、引くと" + delta);
  }
}
