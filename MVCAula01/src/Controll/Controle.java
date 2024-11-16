package Controll;

import java.util.ArrayList;

import Model.Calculadora;

public abstract class Controle {

    public static Double Calcular(String numero1, String operador, String numero2) throws Exception {

        try {

            Double valor1 = Double.parseDouble(numero1);
            ConfereOperador(operador);
            Double valor2 = Double.parseDouble(numero2);
            return Calculadora.Calcular(valor1, operador, valor2);

        }catch (NumberFormatException e){
            throw new Exception("Número inválido");
        }         
        catch (Exception e) {
            throw e;
        }


    }

    // O retorno real é uma lista de Conta
    public static ArrayList<?> GetHistorico(){
        return Calculadora.GetHistorico();
    }

    private static void ConfereOperador(String operador) throws Exception{
        if (operador.isEmpty()){
            throw new Exception("Operador inválido, Não inserido");
        }
        
        if (operador.length() != 1){
            throw new Exception("Operador inválido, mais de um dígito");
        }
        if ( !(operador.equals("+") || operador.equals("-") || 
        operador.equals("*") || operador.equals("/")) ){
            throw new Exception("Operador inválido, comando inexistente");
        }        
    }

}
