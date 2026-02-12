void main() {
  IO.println("あなたの運勢を占います");
  int fortune = new java.util.Random().nextInt(5) + 1;
  switch (fortune) {
    case 1, 2:
      IO.println("いいね！");
      break;
    case 3:
      IO.println("普通です");
      break;
    case 4, 5:
      IO.println("うーん…");
  }
}