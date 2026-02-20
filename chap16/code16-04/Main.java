import java.util.HashSet;
import java.util.Set;

public class Main {
  void main() {
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    for (String s : colors) {
      IO.print(s + "→");
    }
  }
}