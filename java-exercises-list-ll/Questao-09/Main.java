import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float salarioBruto;
    float salarioLiquido;
    float descontos;
    float valorEmprestimo;
    System.out.println("Digite o valor do seu salario bruto:");
    salarioBruto = teclado.nextFloat();
    System.out.println("Digite o valor dos descontos:");
    descontos = teclado.nextFloat();
    salarioLiquido = salarioBruto - descontos;
    valorEmprestimo = (salarioLiquido * 30) / 100;
    if(salarioLiquido > valorEmprestimo) {
      System.out.println("Você poderá fazer o emprestimo ! Valor de: R$ " + valorEmprestimo);
    } else {
      System.out.println("Você não poderá fazer o emprestimo !");
    }
  }
}