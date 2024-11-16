package Model;

public abstract class ModelExec02 {
    
    public static String Executa(Double numero){
        if (numero > 0){
            return "Número maior que zero";
        } else if (numero == 0){
            return "Número é igual a zero";
        }else {
            return "Número menor que zero";
        }
    }

}
