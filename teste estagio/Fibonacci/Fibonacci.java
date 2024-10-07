package Fibonacci;

public class Fibonacci {

    /*
 * Dado a sequência de Fibonacci.Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos
   2  valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na
   linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci.Fibonacci e retorne uma
   mensagem avisando se o número informado pertence ou não a sequência.
 *
 * IMPORTANTE:
   Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser
   previamente definido no código;
*/


    /*Feito com a técnica de programação dinâmica para evitar recursão*/
    public static boolean isFibonacci(int number) {
        int[] sequence =new int[number];
        if (number == 0 || number == 1){
            return true;
        }
        sequence[0] = 0;
        sequence[1]= 1;
        while (sequence[1] < number) {
            int temp = sequence[0];
            sequence[0] = sequence[1];
            sequence[1] = sequence[1] + temp;
        }
        return sequence[1] == number;
    }
}
