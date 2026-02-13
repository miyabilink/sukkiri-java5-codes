// int型配列を受け取り、すべての要素を表示するメソッド
void printArray(int[] array) {
  for (int element : array) {
    IO.println(element);
  }
}

void main() {
  int[] array = {1, 2, 3};
  printArray(array);    // 配列を渡す
}