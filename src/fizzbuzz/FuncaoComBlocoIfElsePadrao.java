package fizzbuzz;

public class FuncaoComBlocoIfElsePadrao {
    public static void executar(int[] valores) {
        for (int valor : valores) {
            String saida;
            if (valor % 3 == 0 && valor % 5 == 0) {
                saida = "FizzBuzz";
            } else if (valor % 3 == 0) {
                saida = "Fizz";
            } else if (valor % 5 == 0) {
                saida = "Buzz";
            } else {
                saida = String.format("%d", valor);
            }
            System.out.println(saida);
        }
    }
}
