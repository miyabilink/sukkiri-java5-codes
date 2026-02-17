public class Thief extends Character {
  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    IO.println("敵に7ポイントのダメージをあたえた！");
    m.hp -= 7;
  }
}