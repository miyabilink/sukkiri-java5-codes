import java.util.*;

public class Main {
  void main() {
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 239);
    prefs.put("東京都", 1328);
    prefs.put("熊本県", 169);
    for (String key : prefs.keySet()) {
      int value = prefs.get(key);
      IO.println(key + "の人口は約" + value + "万人");
    }
  }
}