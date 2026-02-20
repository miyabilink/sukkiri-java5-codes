public class Main {
  void main() {
    String s1 = "Java and JavaScript";
    if (s1.contains("Java")) {
      IO.println("文字列s1は、Javaを含んでいます");
    }
    if (s1.endsWith("Java")) {
      IO.println("文字列s1は、Javaが末尾にあります");
    }
    IO.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    IO.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
  }
}