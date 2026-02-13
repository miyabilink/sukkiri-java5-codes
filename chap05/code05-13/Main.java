int[] makeArray(int size) {
  int[] newArray = new int[size];
  for (int i = 0; i < newArray.length; i++ ) {
    newArray[i] = i;
  }
  return newArray;
}

void main() {
  int[] array = makeArray(3);
  for (int i : array) {
    IO.println(i);
  }
}