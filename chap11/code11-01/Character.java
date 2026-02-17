public class Character {
  String name;
  int hp;

  // 逃げる
  public void run() {
    IO.println(this.name + "は逃げ出した");
  }
  // 戦う
  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    m.hp -= ??;
    IO.println("敵に？？ポイントのダメージをあたえた！");
  }
}