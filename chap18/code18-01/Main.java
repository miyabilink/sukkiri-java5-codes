import java.io.*;

public class Main {
  void main() throws Exception {
    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    while (input != -1) {
      IO.print((char)input);
      input = fr.read();
    }
    fr.close();
  }
}