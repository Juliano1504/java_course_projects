package Model;

import java.util.ArrayList;

public abstract class Calculadora {
    
    public static Double Calcular(Double numero1, String operador, Double numero2){
        
        Double resultado = 0d;
        if (operador.equals("+")){
            resultado = numero1 + numero2;
        } else if(operador.equals("-")){
            resultado = numero1 - numero2;
        }else if(operador.equals("*")){
            resultado = numero1 * numero2;
        }else{
            resultado = numero1 / numero2;
        }
        AddRegistro(numero1, operador, numero2);
        return resultado;
    }

    private static void AddRegistro(Double numero1, String operador, Double numero2){
        Registro.ultimaConta = new Conta(numero1,operador,numero2);
        Registro.ultimoOperador = operador;
        Registro.historico.add(new Conta(numero1,operador,numero2));
    }

    public static ArrayList<Conta> GetHistorico(){
        return Registro.historico;
    }
    

}
