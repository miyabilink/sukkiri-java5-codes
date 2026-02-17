public class Wizard {
  String name;
  int hp;
  public void heal(Hero h) {
    h.hp += 10;
    IO.println(h.name + "のHPを10回復した！");
  }
}