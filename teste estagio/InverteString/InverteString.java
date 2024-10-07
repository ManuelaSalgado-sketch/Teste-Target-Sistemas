package InverteString;

public class InverteString {


    public static void inverteString(String str) {
        StringBuilder inversa = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            inversa.append(str.toCharArray()[i]);
        }
        System.out.printf("Palavra invertida: %s\n", inversa);
    }
}
