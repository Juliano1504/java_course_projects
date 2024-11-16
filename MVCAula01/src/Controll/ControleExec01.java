package Controll;
import Model.ModelExec01;

public abstract class ControleExec01 {

    public static String Executa(String numero){
        try {
            int valor = Integer.parseInt(numero);
            return ModelExec01.Executa(valor);
        } catch (Exception e) {
            return "Número inválido";
            // System.out.println("Número inválido");
        }


    }


}
