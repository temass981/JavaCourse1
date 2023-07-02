public class Main {
  public static void main(String[] args) {
  output (1000, -2);
  }
  static void output(int a, int b){
    for (int i = a; i >= 1; i+=b) {
      System.out.println(i);
    }
  }
}