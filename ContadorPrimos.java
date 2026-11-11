public class ContadorPrimos {

    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int inicio = 1;
        int fim = 15_000_000;

        long tempoInicial = System.nanoTime();

        int quantidadePrimos = 0;

        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                quantidadePrimos++;
            }
        }

        long tempoFinal = System.nanoTime();
        long tempoTotal = tempoFinal - tempoInicial;

        System.out.println("Intervalo analisado: " + inicio + " até " + fim);
        System.out.println("Quantidade de números primos encontrados: " + quantidadePrimos);
        System.out.println("Tempo total de execução (nanoTime): " + tempoTotal + " ns");
        System.out.println("Tempo total em milissegundos: " + (tempoTotal / 1_000_000.0) + " ms");
    }
}