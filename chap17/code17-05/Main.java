import java.io.*;

public class Main {
  void main() {
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (Exception e) {
      IO.println("何らかの例外が発生しました");
    } finally {
      fw.close();
    }
  }
}