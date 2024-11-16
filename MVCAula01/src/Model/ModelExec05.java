package Model;

public class ModelExec05 {
    
    public static String Executa(double numero1, double numero2, double numero3){
        if (numero1 > numero2 && numero1 > numero3) {
            return "O primeiro número é maior";
        } else if (numero2 > numero1 && numero2 > numero3) {
            return "O segundo número é o maior";
        } else if (numero3 > numero1 && numero3 > numero2) {
            return "O teceiro número é o maior";
        } else {
            return "Ao menos 2 números são iguais";
        }
    
    }
}
