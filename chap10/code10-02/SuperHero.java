public class SuperHero {
  String name = "ミナト";
  int hp = 100;
  boolean flying;

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
  // 飛ぶ
  public void fly() {
    this.flying = true;
    IO.println("飛び上がった！");
  }
  // 着地する
  public void land() {
    this.flying = false;
    IO.println("着地した！");
  }
}