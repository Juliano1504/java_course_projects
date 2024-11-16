package Controll;

import Model.ModelExec08;

public class ControleExec08 {
    public static String Executa(String numero){
        try {
            int valor = Integer.parseInt(numero);
            return ModelExec08.Executa(valor);
        } catch (Exception e) {
            throw e;
        }
    }
}
