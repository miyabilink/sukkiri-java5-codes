public class SuperHero extends Hero {
  boolean flying;

  public void fly() {
    this.flying = true;
    IO.println("飛び上がった！");
  }
  public void land(){
    this.flying = false;
    IO.println("着地した！");
  }
  public void run() {
    IO.println(this.name + "は撤退した");
  }
}