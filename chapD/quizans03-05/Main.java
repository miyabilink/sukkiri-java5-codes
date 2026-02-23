void main() {
  IO.print("［メニュー］1：検索 2：登録 3：削除 4：変更＞");
  String selected_str = IO.readln();
  int selected_int = Integer.parseInt(selected_str);
  switch (selected_int) {
    case 1 -> {
      IO.println("検索します");
    }
    case 2 -> {
      IO.println("登録します");
    }
    case 3 -> {
      IO.println("削除します");
    }
    case 4 -> {
      IO.println("変更します");
    }
  }
}
// 入力された値が1から4のいずれでもない場合は何もしないため、defaultラベルの記述は不要です。