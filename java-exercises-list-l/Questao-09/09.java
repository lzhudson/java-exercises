public class Main {
    public static void main(String args[]) {
      double valorMensal = 900;
      int qtdMeses = 12;
      double taxaDeRendimento = 0.05;
      double valorFinal = 0;
      for(var i = 1; i <= qtdMeses; i++){
        valorFinal += valorMensal * taxaDeRendimento;
      }
      System.out.println(valorFinal + valorMensal);
    }
}

