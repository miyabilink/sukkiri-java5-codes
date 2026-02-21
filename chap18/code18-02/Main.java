import java.io.*;

public class Main {
  void main() throws Exception {
    FileWriter fw = new FileWriter("data.txt");
    fw.write('さ');
    fw.write('よ');
    fw.write('う');
    fw.write('な');
    fw.write('ら');
    fw.close();
  }
}