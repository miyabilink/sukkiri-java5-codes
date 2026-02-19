public class Main {
  void main() {
    Hero h1 = new Hero();
    Hero h2 = new Hero();

    Hero.money = 100;
    IO.println(Hero.money);
    IO.println(h1.money);
    h1.money = 300;
    IO.println(h2.money);
  }
}