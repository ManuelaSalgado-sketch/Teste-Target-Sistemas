import Fibonacci.Fibonacci;
import InverteString.InverteString;
import SomaSimples.SomaSimples;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("| Teste estágio Target Sistemas| \n --------------------------------\n");

        while(true){
            System.out.println("Escolha umas da questões abaixo: \n" +
                    "1. Váriavel soma 1\n" +
                    "2. Número pertencente a sequência de Fibonacci 2\n" +
                    "3. Inverter string 3\n" +
                    "4. Sair");
            int option;
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.nextLine();
        switch (option) {
            case 1:
                SomaSimples.soma();
                break;
            case 2:
                System.out.println("Digite o número que você deseja verificar: \n");
                int number = sc.nextInt();
                sc.nextLine();
                if (Fibonacci.isFibonacci(number)){
                    System.out.println("O número " + number + " pertence a sequência");
                } else {
                    System.out.println("O número " + number + " não pertence a sequência");
                }
                break;
            case 3:
                System.out.println("Digite a palavra que deseja inverter: \n");
                String str = sc.nextLine();
                InverteString.inverteString(str);
                break;
            case 4:
                System.out.println("Até logo!");
                sc.close();
                System.exit(1);
            default:
                System.out.println("Selecione uma opção válida!");
                break;
        }
    }

    }
}
