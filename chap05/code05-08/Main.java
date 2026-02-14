public static int add(int x, int y) {
  int ans = x + y;
  return ans;
}

void main() {
  IO.println(add(add(10, 20), add(30, 40)));
}