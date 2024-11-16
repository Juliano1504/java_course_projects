package Model;

public class ModelExec08 {
    public static String Executa(int numero) {
        if (numero > 0) {
            for (int i = 1; i < numero; i++) {
                System.out.print(i + " ");
            }
        } else if (numero < 0) {
            for (int i = numero; i < 0; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Número é igual a zero");
        }
        return "";
    }
}
