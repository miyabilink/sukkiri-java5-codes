public class Main {
  public static void heal(int hp) {
    hp += 10;
  }
  public static void heal(Thief thief) {
    thief.hp += 10;
  }
  void main() {
    int baseHp = 25;
    Thief t = new Thief("アサカ", baseHp);
    heal(baseHp);
    IO.println(baseHp + " : " + t.hp);
    heal(t);
    IO.println(baseHp + " : " + t.hp);
  }
}