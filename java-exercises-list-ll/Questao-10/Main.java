import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int idade;
    System.out.println("Informe sua idade: ");
    idade = teclado.nextInt();
    if(idade < 16) {
      System.out.println("Você não pode votar");
    } else if(idade >= 16 && idade < 18){
      System.out.println("Seu voto é facultativo");
    } else {
      System.out.println("Seu voto é obrigatório");
    }
  }
}