import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int qtdHomens;
    int qtdMulheres;
    float percentHomens;
    float percentMulheres;
    int totalTurma;

    System.out.println("Digite a quantidade de homens da turma: ");
    qtdHomens = teclado.nextInt();
    System.out.println("Digite a quantidade de mulheres: ");
    qtdMulheres = teclado.nextInt();

    totalTurma = qtdHomens + qtdMulheres;
    percentHomens = (qtdHomens * 100) / totalTurma;
    percentMulheres = (qtdMulheres * 100) / totalTurma;
    
    System.out.println("O percentual de homens na turma é de: " + percentHomens + "%");
    System.out.println("O percentual de mulheres na turma é de: " + percentMulheres + "%");
  }
}