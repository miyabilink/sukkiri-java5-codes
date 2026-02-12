void main() {
  IO.println("名前を入力>");
  String name = IO.readln();
  String hobby = IO.readln("趣味を入力>");
  IO.println("ようこそ、" + hobby + "が趣味の" + name + "さん");
}
