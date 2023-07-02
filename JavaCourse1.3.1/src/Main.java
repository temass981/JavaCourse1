import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int randomNumber = random.nextInt(15);
    int[] array = array(randomNumber);
    System.out.println();
    int[] reverseArray = reverseArray(array);
  }

  public static int[] array(int sizeArray) {
    Random random = new Random();
    int[] arrya = new int[sizeArray];

    for(int i = 0; i < arrya.length; ++i) {
      int randomNumber = random.nextInt(100);
      arrya[i] = randomNumber;
      System.out.print(arrya[i] + " ");
    }

    return arrya;
  }

  public static int[] reverseArray(int[] array) {
    int[] reverseArray = new int[array.length];
    int i = array.length-1;

    for(int j = 0; i >= 0; ++j) {
      reverseArray[j] = array[i];
      System.out.print(reverseArray[j] + " ");
      --i;
    }

    return reverseArray;
  }
}
