import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int randomNumber = random.nextInt(15);
    int[] array = array(randomNumber);
    System.out.println();
    checkingTheElement(array);
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

  public static void checkingTheElement(int[] array) {
    Arrays.sort(array);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите значение элемента, чтобы проверить, есть ли он в массиве");
    int number = scanner.nextInt();
    int checkingTheElement = Arrays.binarySearch(array, number);
    //System.out.println(checkingTheElement);
    if (checkingTheElement < 0) {
      System.out.println("Данного элемента нет в массиве");
    } else {
      System.out.println("Данный элемент есть в массиве");
    }

  }
}