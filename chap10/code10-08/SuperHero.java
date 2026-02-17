public class SuperHero extends Hero {
  boolean flying;

  public void fly(){
    this.flying = true;
    IO.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    IO.println("着地した！");
  }
  public void run() {
    IO.println("撤退した");
  }
  public void attack(Matango m) {
    IO.println(this.name + "の攻撃！");
    m.hp -= 5;
    IO.println("5ポイントのダメージをあたえた!");
    if (this.flying) {
      IO.println(this.name + "の攻撃！");
      m.hp -= 5;
      IO.println("5ポイントのダメージをあたえた!");
    }
  }
}