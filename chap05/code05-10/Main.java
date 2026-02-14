public static int add(int x, int y) {
  return x + y;
}

public static int add(int x, int y, int z) {
  return x + y + z;
}

void main(){
  IO.println("10+20=" + add(10, 20));
  IO.println("10+20+30=" + add(10, 20, 30));
}