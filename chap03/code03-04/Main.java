void main() {
  IO.println("あなたの運勢を占います");
  int fortune = new java.util.Random().nextInt(4) + 1;
  if (fortune == 1) {
    IO.println("大吉");
  } else if (fortune == 2) {
    IO.println("中吉");
  } else if (fortune == 3) {
    IO.println("吉");
  } else {
    IO.println("凶");
  }
}