package View;

import java.util.Scanner;

import Controll.ControleExec02;

public abstract class Exec02 {
    /*Crie um programa que recebe um número e informa
     na tela se ele é maior que zero, menor que zero ou igual a zero */


    public static void Main(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número que direi algo legal sobre ele");
        
        try {
            String numero = scan.nextLine();
            System.out.println(ControleExec02.Executa(numero));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scan.close();

    }


}
