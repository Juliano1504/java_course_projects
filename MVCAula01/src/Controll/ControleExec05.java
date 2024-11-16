package Controll;

import Model.ModelExec05;

public abstract class ControleExec05 {
    
    public static String Executa(String numero1, String numero2, String numero3){

        try {
            Double valor1 = Double.parseDouble(numero1);
            Double valor2 = Double.parseDouble(numero2);
            Double valor3 = Double.parseDouble(numero3);
            return ModelExec05.Executa(valor1, valor2, valor3);
        } catch (Exception e) {
            throw e;
        }
    }
}
