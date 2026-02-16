public class Hero {
  String name;
  int hp;

  void sleep() {
    this.hp = 100;
    IO.println(this.name + "は、眠って回復した！");
  }
}
