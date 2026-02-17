public class Hero {
  String name = "ミナト";
  int hp = 100;

  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    m.hp -= 5;
    IO.println("5ポイントのダメージをあたえた!");
  }
  public final void slip() {
    this.hp -= 5;
    IO.println(this.name + "は転んだ!");
    IO.println("5のダメージ");
  }
  public void run() {
    IO.println(this.name + "は逃げ出した！");
  }
}