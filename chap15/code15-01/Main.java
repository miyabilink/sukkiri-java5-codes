public class Main {
  void main() {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";
    if (s2.equals(s3)) {
      IO.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) {
      IO.println("s2とs3はケースを区別しなければ等しい");
    }
    IO.println("s1の長さは" + s1.length() + "です");
    if (s1.isEmpty()) {
      IO.println("s1は空文字です");
    }
  }
}