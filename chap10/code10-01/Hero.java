public class Hero {
  String name = "ミナト";
  int hp = 100;

  // 戦う
  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    m.hp -= 5;
    IO.println("5ポイントのダメージをあたえた！");
  }
  // 逃げる
  public void run() {
    IO.println(this.name + "は逃げ出した！");
  }
}