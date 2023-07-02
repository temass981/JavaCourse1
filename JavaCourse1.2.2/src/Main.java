import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    palindrome(str);
  }
  public static void palindrome (String str){
    char [] array = str.toCharArray();
    for (int i = 0, j= array.length-1; i < array.length/2; i++,j--) {
      if (array[i]!=array[j]) {
        System.out.println("Строка не является палиндромом");
        break;
      }
      else if (i== (array.length/2)-1 )System.out.println("Строка является палиндромом");
    }
  }
}