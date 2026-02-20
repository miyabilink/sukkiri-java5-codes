public class Main {
  void main() {
    try {
      // 試験的に例外を発生させる
      throw new UnsupportedMusicFileException("未対応のファイルです");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}