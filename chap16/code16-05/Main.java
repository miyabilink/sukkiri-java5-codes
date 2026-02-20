import java.util.Set;
import java.util.TreeSet;

public class Main {
  void main() {
    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      IO.print(s + "→");
    }
  }
}