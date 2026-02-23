void main() {
  // (1)配列の準備
  int[] numbers = {3, 4, 9};

  // (2)メッセージの表示
  IO.println("1桁の数字を入力してください");

  // (3)キーボードからの数字入力
  String inputStr = IO.readln();
  int input = Integer.parseInt(inputStr);

  // (4)配列を回しながら判定
  for (int n : numbers) {
    if (n == input) {
      IO.println("アタリ！");
    }
  }
}