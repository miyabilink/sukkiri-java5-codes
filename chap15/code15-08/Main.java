public class Main {
  void main() {
    String s = "abc,def:ghi";
    String w = s.replaceAll("[beh]", "X");
    IO.println(w);  // aXc,dXf:gXi
  }
}