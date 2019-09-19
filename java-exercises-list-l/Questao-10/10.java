public class Main {
    public static void main(String args[]) {
      double valorMensal = 10000;
      int qtdMeses = 3;
      double taxaDeRendimento = 0.10;
      double valorFinal = 0;
      for(var i = 1; i <= qtdMeses; i++){
        valorFinal += (valorMensal + valorFinal) * taxaDeRendimento;
      }
      System.out.println((valorFinal + valorMensal)-  valorFinal);
    }
}

