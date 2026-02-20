import java.util.ArrayList;

public class Main {
  void main() {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);
    for (int i : points) {
      IO.println(i);
    }
  }
}