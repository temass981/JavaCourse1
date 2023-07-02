import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    char [] array = array();
    maximumNumberOfConsecutiveZeros(array);
  }
  public static char [] array(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите строку из нулей и едениц");
    String str = scan.nextLine();
    char [] array = str.toCharArray();
    return array;
  }
  public static void maximumNumberOfConsecutiveZeros (char [] array){
    int max = 0;
    int counter =0;
    for (int i = 0; i < array.length; i++) {
      if(array[i]=='0') {
        counter++;
        if(max<counter) max=counter;
      }
      else counter=0;
    }
    System.out.println("максимальное количество подряд нулей = "+max);
  }
}