public static void methodA() {
  IO.println("methodA");
  methodB();
}

public static void methodB() {
  IO.println("methodB");
}

void main() {
  methodA();
}