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
      System.out.println("Введите четное количество чисел");
      str = scan.nextLine();
    } while (str.length()%2!=0);
    number = Integer.parseInt(str);
    return number;
  }
  static void luckyTicket(int number){
    String str = Integer.toString(number);
    int count = 10;
    int firstNumber=0, secondNumber=0;
    for (int i = 0; i < str.length(); i++) {
      if (i<str.length()/2) {
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