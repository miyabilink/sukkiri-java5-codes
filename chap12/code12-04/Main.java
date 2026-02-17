public class Main {
  void main() {
    Wizard w = new Wizard();
    Character c = w;
    Matango m = new Matango();
    c.name = "アサカ";
    c.attack(m);
    c.fireball(m);
  }
}