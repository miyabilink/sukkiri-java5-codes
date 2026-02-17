public class Hero extends Character {
  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    IO.println("敵に10ポイントのダメージをあたえた！");
    m.hp -= 10;
  }
  public void attack(Goblin g) {
    IO.println(this.name + "の攻撃！");
    IO.println("敵に10ポイントのダメージをあたえた！");
    g.hp -= 10;
  }
  // 以下、スライム用などが続く
}