void methodA() {
  IO.println("methodA");
  methodB();
}

void methodB() {
  IO.println("methodB");
}

void main() {
  methodA();
}