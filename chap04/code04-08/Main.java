void main() {
  int[] scores = {20, 30, 40, 50, 80};
  int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
  int avg = sum / scores.length;
  IO.println("合計点:" + sum);
  IO.println("平均点:" + avg);
}