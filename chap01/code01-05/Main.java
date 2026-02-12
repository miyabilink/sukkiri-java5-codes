void main() {
  final double PI = 3.14;
  int pie = 5;
  IO.println("半径" + pie + "cmのパイの面積は、");
  IO.println(pie * pie * PI);
  IO.println("パイの半径を倍にします");
  PI = 10;
  IO.println("半径" + pie + "cmのパイの面積は、");
  IO.println(pie * pie * PI);
}