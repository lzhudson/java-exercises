import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float salarioUsuario;
    float salarioMinimoAtual;
    float qtdSalariosMinimos;
    String plural;
    System.out.print("Digite o valor do seu salario: ");
    salarioUsuario = teclado.nextFloat();
    System.out.print("Digite o valor do salario minimo atual: ");
    salarioMinimoAtual = teclado.nextFloat();

    
    qtdSalariosMinimos = salarioUsuario / salarioMinimoAtual;
    if(qtdSalariosMinimos > 1){
      plural = "s";
    } else {
      plural = "";
    }
    
    System.out.println("Você recebe em torno de " + qtdSalariosMinimos + " salario" + plural + " minimo" + plural);
  }
}