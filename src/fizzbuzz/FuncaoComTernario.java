package fizzbuzz;

public class FuncaoComTernario {
    public static void executar(int[] valores) {
        for (int valor : valores) {
            System.out.println(
                    (valor % 3 == 0) ? (valor % 5 == 0 ? "FizzBuzz" : "Fizz") : (valor % 5 == 0 ? "Buzz" : valor)
            );
        }
    }
}
