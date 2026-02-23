void main() {
  int isHungry = 1;
  String food = "おにぎり";
  IO.println("こんにちは");
  if (isHungry == 0) {
    IO.println("お腹がいっぱいです");
  } else {
    IO.println("はらぺこです");
  }
  if (isHungry == 1) {
    IO.println(food + "をいただきます");
  }
  IO.println("ごちそうさまでした");
}
/* 
  5~9行目は、三項演算子を用いると以下のような記述もできます。
  IO.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです");
*/