package Model;

public abstract class ModelExec01 {
    
    public static String Executa(int numero){
        if (numero > 10){
            // return String.valueOf(numero);
            return numero + "";
        }else {
            return "Número Menor que 10";
        }


    }

}
