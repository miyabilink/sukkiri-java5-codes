import java.util.*;

public class Main {
  void main() {
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
    heroes.put(h1, 3);
    heroes.put(h2, 7);
    for (Hero key : heroes.keySet()) {
      int value = heroes.get(key);
      IO.println(key.getName() + "が倒した敵＝" + value);
    }
  }
}