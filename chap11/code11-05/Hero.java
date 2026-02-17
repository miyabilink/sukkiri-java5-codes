public class Hero extends Character {
  public void atack(Matango m) {
    IO.println(this.name + "の攻撃！");
    IO.println("敵に10ポイントのダメージをあたえた！");
    m.hp -= 10;
  }
}