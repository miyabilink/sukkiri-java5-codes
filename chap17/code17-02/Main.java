import java.io.*;

public class Main {
  void main() {
    try {
      FileWriter fw = new FileWriter("data.txt");
      /* : */
    } catch(IOException e) {
      IO.println("エラーが発生しました");
    }
  }
}