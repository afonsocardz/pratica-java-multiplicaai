import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Digite um número: ");
    final Scanner input = new Scanner(System.in);

    final int number = input.nextInt();

    System.out.println("Tabela de multiplicação de " + number);

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " X " + i + " = " + (number * i));
    }
  }
}
