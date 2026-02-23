public class Main {
  void main() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.append(i+1).append(",");
    }
    String s = sb.toString();
    String[] a = s.split(",");
  }
}