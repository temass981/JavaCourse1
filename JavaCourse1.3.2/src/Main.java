import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int randomNumber = random.nextInt(5, 10);
    int[] array = array(randomNumber);
    array = bubbleSorting(array);
    System.out.println();
    arrayOutput(array);
  }

  public static int[] array(int sizeArray) {
    Random ranodm = new Random();
    int[] array = new int[sizeArray];

    for(int i = 0; i < array.length; ++i) {
      int randomNumber = ranodm.nextInt(100);
      array[i] = randomNumber;
      System.out.print(array[i] + " ");
    }

    return array;
  }

  public static int[] bubbleSorting(int[] array) {
    for(int i = 0; i < array.length; ++i) {
      for(int j = i; j < array.length; ++j) {
        if (array[i] < array[j]) {
          int var = array[i];
          array[i] = array[j];
          array[j] = var;
        }
      }
    }

    return array;
  }

  public static void arrayOutput(int[] array) {
    int[] var1 = array;
    int var2 = array.length;

    for(int var3 = 0; var3 < var2; ++var3) {
      int element = var1[var3];
      System.out.print("" + element + " ");
    }

  }
}