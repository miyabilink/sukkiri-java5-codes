void main() {
  int[] scores = {20, 30, 40, 50, 80};
  int sum = 0;
  for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
  }
  int avg = sum / scores.length;
  IO.println("合計点:" + sum);
  IO.println("平均点:" + avg);
}