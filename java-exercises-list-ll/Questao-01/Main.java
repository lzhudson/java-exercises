import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int anoNascimento;
    int anoAtual;
    int idadeUsuario;
    
    
    System.out.println("Digite seu ano de nascimento: ");
    anoNascimento = teclado.nextInt();
    System.out.println("Digite o ano atual: ");
    anoAtual = teclado.nextInt();

    idadeUsuario = anoAtual - anoNascimento;
    System.out.println("Você tem " + idadeUsuario + " anos de idade.");
  }
}