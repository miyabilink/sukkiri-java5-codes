public class Dancer extends Character {
  public void dance() {
    IO.println(this.name + "は情熱的に踊った");
  }
  public void attack(Matango m) {
    IO.println(this.name + "の攻撃");
    IO.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }
}