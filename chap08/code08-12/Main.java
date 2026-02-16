public class Main {
  void main() {
    // 1.勇者を生成
    Hero h = new Hero();
    // 2.フィールドに初期値をセット
    h.name = "ミナト";
    h.hp = 100;
    IO.println("勇者" + h.name + "を生み出しました！");
  }
}
