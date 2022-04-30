package fizzbuzz;

/**
 * @author Edivaldo Ramos
 * @since 2022-04-29
 */
public class FizzBuzz {
    public static void main(String[] args) {
        //Dado um array de inteiros de 1 a 15.

        //Desafio: implemente uma função que deverá iterar sobre cada elemento e fazer as seguintes operações:
        // 1º - caso o valor do elemento seja multiplo de 3 e multiplo de 5 de imprimir "FizzBuzz"
        // 2º - caso o valor do elemento seja multiplo de 3 e não seja multiplo de 5 de imprimir "Fizz"
        // 3º - caso o valor do elemento não seja multiplo de 3 e seja multiplo de 5 de imprimir "Buzz"
        // 4º - caso o valor do elemento não seja multiplo nem de 3 e nem de 5, deve imprimir o valor do elemento
        // Resultado esperado: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

        int[] valores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //Alternativas de implemetações da solução do problema (comentar as demais ao executar cada 1 das alternativas)

        //Função utilizando blocos padroes de if e else
        FuncaoComBlocoIfElsePadrao.executar(valores);
        //Função utilizando operador ternário
        FuncaoComTernario.executar(valores);
        //Função utilizando Stream do Java 8
        FuncaoComStreamJava8.executar(valores);
    }
}
