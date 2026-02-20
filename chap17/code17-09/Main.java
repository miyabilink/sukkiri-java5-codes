import java.io.*;

public class Main {
  void main() {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (Exception e) {
      IO.println("何らかの例外が発生しました");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          ;
        }
      }
    }
  }
}