import java.util.*;

class Hero {
  public String name;
}

public class Main {
  void main() {
    Hero h = new Hero();
    h.name = "ミナト";
    List<Hero> list = new ArrayList<Hero>();
    list.add(h);
    h.name = "スガワラ";
    IO.println(list.get(0).name);
  }
}