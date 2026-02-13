// int型配列を受け取り、
// 配列内の要素すべてに1を加えるメソッド
void incArray(int[] array) {
  for (int i = 0; i < array.length; i++) {
    array[i]++;
  }
}

void main() {
  int[] array = {1, 2, 3};
  incArray(array);
  for (int i : array) {
    IO.println(i);
  }
}