import java.util.Scanner;
class Main {
  public static void main(String[] args) {

   Scanner teclado = new Scanner(System.in);
  
   float notaAV1, notaAV2, notaAV3, notaAV4;
   float mediaFinal;

   System.out.println("Digite a nota da primeira avaliação: ");
   notaAV1 = teclado.nextFloat();
   System.out.println("Digite a nota da segunda avaliação: ");
   notaAV2 = teclado.nextFloat();
   System.out.println("Digite a nota da terceira avaliação: ");
   notaAV3 = teclado.nextFloat();
   System.out.println("Digite a nota da quarta avaliação: ");
   notaAV4 = teclado.nextFloat();

   mediaFinal = (notaAV1 + notaAV2 + notaAV3 + notaAV4) / 4;
   System.out.println("A sua média foi de: " + mediaFinal + " pontos.");
  }
}