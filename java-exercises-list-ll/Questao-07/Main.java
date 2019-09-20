import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float comissao;
    float porcentagemComissao = 10;
    float despesaCliente;
    System.out.println("Digite o valor da despesa do cliente:");
    despesaCliente = teclado.nextFloat();
    comissao = (despesaCliente * porcentagemComissao) / 100;
    System.out.println("Sua comissão foi de: " + comissao);
  }
}