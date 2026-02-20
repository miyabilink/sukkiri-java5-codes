public class Main {
  void main() {
    long start = System.currentTimeMillis();
    // ここでなんらかの時間がかかる処理
    long end = System.currentTimeMillis();
    IO.println("処理にかかった時間は" + (end-start) + "ミリ秒でした");
  }
}