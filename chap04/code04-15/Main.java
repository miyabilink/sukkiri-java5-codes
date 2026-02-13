void main() {
  int[] arrayA = {1, 2, 3};
  int[] arrayB;
  arrayB = arrayA;
  arrayB[0] = 100;
  IO.println(arrayA[0]);
}