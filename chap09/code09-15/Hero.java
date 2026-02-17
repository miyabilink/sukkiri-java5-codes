public class Hero {
  String name;
  int hp;
  Sword sword;

  public void attack() {
    IO.println(this.name + "は攻撃した！");
    IO.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero(String name) {    // コンストラクタ①
    this.hp = 100;
    this.name = name;
  }
  public Hero() {    // コンストラクタ②
    this.Hero("ダミー");
  }
}