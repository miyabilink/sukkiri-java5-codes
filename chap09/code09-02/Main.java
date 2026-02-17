public class Main {
  void main() {
    Hero h1;
    h1 = new Hero();
    h1.hp = 100;
    Hero h2;
    h2 = h1;
    h2.hp = 200;
    IO.println(h1.hp);
  }
}