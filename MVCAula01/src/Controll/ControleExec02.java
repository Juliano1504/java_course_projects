package Controll;

import Model.ModelExec02;

public abstract class ControleExec02 {
    

    public static String Executa(String numero) throws Exception{

        try {
            Double valor = Double.parseDouble(numero);
            return ModelExec02.Executa(valor);           
        } catch (Exception e) {
            throw e;
            //throw new Exception("Insira um número por favor");
        }


    }



}
