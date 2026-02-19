public class Main {
  void main() {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;

    if (h1.equals(h2) == true) {
      IO.println("同じ内容です");
    } else {
      IO.println("違う内容です");
    }
  }
}