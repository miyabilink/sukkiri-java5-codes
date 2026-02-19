public class Main {
  void main() {
    Hero.setRandomMoney();
    IO.println(Hero.money);
    Hero h1 = new Hero();
    IO.println(h1.money);
  }
}