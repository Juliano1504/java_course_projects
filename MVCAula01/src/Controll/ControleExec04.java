package Controll;

import Model.ModelExec04;

public abstract class ControleExec04 {
    
    public static String Executa(String numero1, String numero2){

        try {
            int valor1 = Integer.parseInt(numero1);
            int valor2 = Integer.parseInt(numero2);
            return ModelExec04.Executa(valor1, valor2);
        } catch (Exception e) {
            throw e;
        }
    }
}
