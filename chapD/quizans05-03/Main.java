void main() {
  String address = "dummy@example.com";
  String text = "今度、飲みにいきませんか";
  email(address, text);
}

public static void email(String address, String text) {
  IO.println(address + "に、以下のメールを送信しました");
  IO.println("件名：無題");
  IO.println("本文：" + text);
}

public static void email(String title, String address, String text) {
  IO.println(address + "に、以下のメールを送信しました");
  IO.println("件名：" + title);
  IO.println("本文：" + text);
}