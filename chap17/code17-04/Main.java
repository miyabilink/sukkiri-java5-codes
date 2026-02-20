import java.io.*;

public class Main {
  void main() {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (Exception e) {
      IO.println("エラーです");
    }
    fw.close();
  }
}