import java.io.InputStream;
import java.net.*;

public class Main {
  void main() throws Exception {
    URL u = new URI("https://sukkiri.jp/").toURL();
    InputStream is = u.openStream();
    int i = is.read();
    while (i != -1) {
      char c = (char)i;
      IO.print(c);
      i = is.read();
    }
  }
}