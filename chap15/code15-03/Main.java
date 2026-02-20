public class Main {
  void main() {
    String s1 = "Java programing";
    IO.println("文字列s1の4文字目以降は" + s1.substring(3));        // ⇒ a programing
    IO.println("文字列s1の4～8文字目以降は" + s1.substring(3, 8));  // ⇒ a pro
  }
}