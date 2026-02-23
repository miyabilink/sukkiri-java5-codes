void main() {
  IO.print("【数あてゲーム】");
  int ans = new java.util.Random().nextInt(10);
  for (int i = 0; i < 5; i++) {
    IO.println("0〜9の数字を入力してください");
    String numStr = IO.readln();
    int num = Integer.parseInt(numStr);
    if (ans == num) {
      IO.println("アタリ！");
      break;
    } else {
      IO.println("違います");
    }
  }
  IO.println("ゲームを終了します");
}