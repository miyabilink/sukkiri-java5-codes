public class Main {
  void main() throws Exception {
    doWarusa();
    doTogame();
    callDeae();
    showMondokoro();
  }
  public static void doWarusa() {
    IO.println("きなこでござる。食えませんがの。");
  }
  public static void doTogame() {
    IO.println("この老いぼれの目はごまかせませんぞ。");
  }
  public static void callDeae() {
    IO.println("えぇい、こしゃくな。くせ者だ！であえい！");
  }
  public static void showMondokoro() throws Exception {
    IO.println("飛車さん、角さん。もういいでしょう。");
    IO.println("この紋所が目にはいらぬか！");
    doTogame();    // もう一度、とがめる
  }
}