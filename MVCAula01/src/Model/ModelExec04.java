package Model;

public class ModelExec04 {
    
    public static String Executa(int numero1, int numero2){
        if (numero1 > numero2) {
            return "O primeiro número é maior que o segundo";
        } else if (numero1 < numero2) {
            return "O segundo número é maior que o primeiro";
        } else {
            return "São iguais";
        }
    }
}
