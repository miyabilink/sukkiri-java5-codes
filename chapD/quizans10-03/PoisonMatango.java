public class PoisonMatango extends Matango {
  int poisonCount = 5;

  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    super.attack(h);
    if (poisonCount > 0) {
      IO.println("さらに毒の胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      IO.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
    }
  }
}