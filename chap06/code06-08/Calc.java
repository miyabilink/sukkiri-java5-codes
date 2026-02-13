package calcapp.main;

public class Calc {
  void main() {
    int a = 10; int b = 2;
    int total = calcapp.logics.CalcLogic.tasu(a, b);
    int delta = calcapp.logics.CalcLogic.hiku(a, b);
    IO.println("足すと" + total + "、引くと" + delta);
  }
}