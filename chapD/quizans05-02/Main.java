void main() {
  String title = "お誘い";
  String address = "dummy@xxxx.com";
  String text = "今度、飲みにいきませんか";
  email(title, address, text);
}

public static void email(String title, String address, String text) {
  IO.println(address + "に、以下のメールを送信しました");
  IO.println("件名：" + title);
  IO.println("本文：" + text);
}