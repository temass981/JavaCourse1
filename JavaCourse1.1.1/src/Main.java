import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = "start";
    while (!word.equals("stop")) {
      System.out.println("Введите два числа");
       int  a = scan.nextInt();
       int  b = scan.nextInt();
      char symbol;
      do {
        System.out.println("Введите один из  знаков операции, который хотите произвести с числами: +,-,*,/");
        symbol = scan.next().charAt(0);
      } while ((symbol != '+') && (symbol != '-') && (symbol != '*') && (symbol != '/'));
      switch (symbol) {
        case '+':
          System.out.println(a + "+" + b + "=" + (a + b));
          break;
        case '-':
          System.out.println(a + "-" + b + "=" + (a - b));
          break;
        case '*':
          System.out.println(a + "*" + b + "=" + (a * b));
          break;
        case '/':
          if (b == 0) System.out.println("На ноль делить нельзя");
          else System.out.println(a + "/" + b + "=" + (a / b));
          break;
      }
      System.out.println("Если ты хочешь закончить работу приложения введи:\"stop\", иначе любой другой символ");
      word = scan.next();
    }
  }
}