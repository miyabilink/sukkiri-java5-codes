public class Hero {
  String name;
  int hp;
  public void sleep() {
    this.hp = 100;
    IO.println(this.name + "は、眠って回復した！");
  }
  public void sit(int sec) {
    this.hp += sec;
    IO.println(this.name + "は、" + sec + "秒座った！");
    IO.println("HPが" + sec + "ポイント回復した");
  }
  public void slip() {
    this.hp -= 5;
    IO.println(this.name + "は、転んだ！");
    IO.println("5のダメージ！");
  }
  public void run() {
    IO.println(this.name + "は、逃げ出した！");
    IO.println("GAMEOVER");
    IO.println("最終HPは" + this.hp + "でした");
  }
}
