package SomaSimples;

public class SomaSimples {

    public static void soma (){
        int indice = 13, soma = 0, k = 0;
        while(k < indice) {
            k++;
            soma+=k;
        }
        System.out.printf("A soma é igual a : %d\n", soma);
    }
}
