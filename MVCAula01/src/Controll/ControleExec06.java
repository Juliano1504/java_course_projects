package Controll;

import Model.ModelExec06;

public abstract class ControleExec06 {
    public static String Executa(String numero){
        try {
            int valor = Integer.parseInt(numero);
            return ModelExec06.Executa(valor);
        } catch (NumberFormatException e) {
            System.out.println("Errado" + e.getMessage());
            throw e;
        }
    }
}
