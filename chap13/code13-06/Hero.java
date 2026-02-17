public class Hero {
  private int hp;
  String name;
  Sword sword;

  public void bye() {
    IO.println("勇者は別れを告げた");
  }
  private void die() {
    IO.println(this.name + "は死んでしまった！");
    IO.println("GAME OVERです。");
  }
  void sleep() {
    this.hp = 100;
    IO.println(this.name + "は眠って回復した！");
  }
  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    /* … */
    IO.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
    this.hp -= 2;
    if (this.hp <= 0 ) {
      this.die();
    }
  }
  /* … */
}