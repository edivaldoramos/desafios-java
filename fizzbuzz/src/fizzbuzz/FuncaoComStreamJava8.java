package fizzbuzz;

import java.util.Arrays;

public class FuncaoComStreamJava8 {
    public static void executar(int[] valores) {
        Arrays.stream(valores)
                .mapToObj(valor -> (valor % 3 == 0) ? (valor % 5 == 0 ? "FizzBuzz" : "Fizz") : (valor % 5 == 0 ? "Buzz" : valor))
                .forEach(System.out::println);
    }
}
