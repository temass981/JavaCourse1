import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int number = inPutNumber();
    luckyTicket(number);
  }
  static Scanner scan =new Scanner(System.in);
  static int inPutNumber() {
    String str;
    int number;
    do {
      System.out.println("Введите шестизначное число");
      str = scan.nextLine();
    } while (str.length() != 6);
    number = Integer.parseInt(str);
    return number;
  }
  static void luckyTicket(int number){
    int count = 10;
    int firstNumber=0, secondNumber=0;
    for (int i = 0; i < 6; i++) {
      if (i<3) {
        firstNumber += number % count;
        number /= count;
      }
      else{
        secondNumber += number % count;
        number /= count;
      }
    }
    if(firstNumber==secondNumber) System.out.println("Это счастливый билет");
    else System.out.println("Это несчастливый билет");
  }
}