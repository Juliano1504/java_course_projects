package Controll;

import Model.ModelExec07;

public class ControleExec07 {
    public static String Executa(String numero){
        try {
            int valor = Integer.parseInt(numero);
            return ModelExec07.Executa(valor);
        } catch (Exception e) {
            throw e;
        }
    }
}
