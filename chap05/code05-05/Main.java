void main() {
  add(100, 20);
  add(200, 50);
}

// 複数の値を受け取るaddメソッド
public static void add(int x, int y) {
  int ans = x + y;
  IO.println(x + "+" + y + "=" + ans);
}