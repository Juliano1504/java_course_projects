package View;

import Controll.ControleExec03;

public abstract class Exec03 {
    
    public static void Main(){

        // Crie um programa que mostre todos os números inteiros entre -5 e 5

        System.out.println("Todos os números entre -5 e 5");
        int[] valores = ControleExec03.Executa();
        for (int i : valores) {
            System.out.println(i);
        }
    }



}
