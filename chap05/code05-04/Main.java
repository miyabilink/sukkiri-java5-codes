void main() {
  IO.println("メソッドを呼び出します");
  hello("湊");
  hello("朝香");
  hello("菅原");
  IO.println("メソッドの呼び出しが終わりました");
}

void hello(String name) {
  IO.println(name + "さん、こんにちは");
}