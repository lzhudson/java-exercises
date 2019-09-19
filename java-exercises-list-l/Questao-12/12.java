public class Main {
    public static void main(String args[]) {
      double valorMensal = 10000;
      int qtdMeses = 3;
      double taxaDeRendimento = 0.10;
      double valorFinal = 0;
      double impostoSobreInvestimento = 0;
      for(var i = 1; i <= qtdMeses; i++){
        valorFinal += (valorMensal + valorFinal) * taxaDeRendimento;
      }
      valorFinal += valorMensal;
      if(qtdMeses <= 6){
        impostoSobreInvestimento += valorFinal * 0.22;
      } else if (qtdMeses > 6 && qtdMeses <= 12) {
        impostoSobreInvestimento += valorFinal * 0.20;
      } else if (qtdMeses > 12 && qtdMeses < 18) {
        impostoSobreInvestimento += valorFinal * 0.17;
      } else if (qtdMeses >= 24) {
        impostoSobreInvestimento = valorFinal * 0.15;
      }
      System.out.println(impostoSobreInvestimento);
    }
}

