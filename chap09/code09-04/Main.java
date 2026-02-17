public class Main {
  void main() {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    h.sword = s;
    IO.println("現在の武器は" + h.sword.name);
  }
}