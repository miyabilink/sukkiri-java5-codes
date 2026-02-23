public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    IO.println(this.name + "はセルフエイドを唱えた！");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    IO.println("HPが最大まで回復した");
  }
}