import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int idade;
    System.out.println("Digite sua idade:");
    idade = teclado.nextInt();
    if(idade > 18) {
      System.out.println("Usuario é maior de idade");
    } else {
      System.out.println("Usuario é menor de idade");
    }
  }
}