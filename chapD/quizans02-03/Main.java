void main() {
  IO.println("ようこそ占いの館へ");
  IO.print("あなたの名前を入力してください＞");
  String name = IO.readln();
  String ageString = IO.readln("あなたの年齢を入力してください＞");
  int age = Integer.parseInt(ageString);
  int fortune = new java.util.Random().nextInt(4);
  fortune++;
  IO.println("占いの結果が出ました！");
  IO.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
  IO.println("1:大吉　2:中吉　3:吉　4:凶");
}