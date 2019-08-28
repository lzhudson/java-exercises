class Main {
  public static void main(String[] args) {
    int gastoAlimentacao = 600;
    int gastoSaude = 1000;
    int gastoTransporte = 500;
    int gastoLazer = 400;

    int gastoTotal = gastoAlimentacao + gastoSaude + gastoTransporte + gastoLazer;
    System.out.println(gastoTotal);
    int mediaDeGastos = gastoTotal / 4;
    System.out.println(mediaDeGastos);
  }
}