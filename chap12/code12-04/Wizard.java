public class Wizard extends Character {
  int mp;

  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    IO.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }
  public void fireball(Matango m) {
    IO.println(this.name + "は火の玉を放った！");
    IO.println("敵に20ポイントのダメージ");
    m.hp -= 20;
    this.mp -= 5;
  }
}