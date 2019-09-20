import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    float debito;
    int qtdMeses;
    float jurosPorcentagem;
    float valorFinal;
    float juros;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o valor do seu débito: ");
    debito = teclado.nextFloat();
    System.out.print("Digite a quantidade de meses em que deseja pagar: ");
    qtdMeses = teclado.nextInt();
    System.out.print("Digite a porcentagem dos juros: ");
    jurosPorcentagem = teclado.nextFloat();
    juros = debito * (jurosPorcentagem / 100) * qtdMeses;
    valorFinal = debito + juros;
    System.out.print("O valor final da divida é de: " + valorFinal);
    

  }
}