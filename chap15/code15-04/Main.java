public class Main {
  void main() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10000; i++) {
        sb.append("Java");
    }
    String s = sb.toString();
    IO.println(s);
  }
}