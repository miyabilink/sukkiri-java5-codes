public class Main {
  void main() {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words) {
      IO.print(w + "->");
    }
  }
}