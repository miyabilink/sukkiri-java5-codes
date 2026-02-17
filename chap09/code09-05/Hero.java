public class Hero {
  String name;
  int hp;
  Sword sword;

  public void attack() {
    IO.println(this.name + "は攻撃した！");
    IO.println("敵に5ポイントのダメージをあたえた！");
  }
}
