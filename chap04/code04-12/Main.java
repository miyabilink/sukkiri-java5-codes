void main() {
  int[] seq = new int[10];

  // 塩基配列をランダムに生成
  for (int i = 0; i < seq.length; i++) {
    seq[i] = new java.util.Random().nextInt(4);
  }

  // 生成した塩基配列の記号を表示
  for (int i = 0; i < seq.length; i++) {
    switch (seq[i]) {
      case 0 -> {
        IO.print("A ");
      }
      case 1 -> {
        IO.print("T ");
      }
      case 2 -> {
        IO.print("G ");
      }
      case 3 -> {
        IO.print("C ");
      }
    }
  }
}