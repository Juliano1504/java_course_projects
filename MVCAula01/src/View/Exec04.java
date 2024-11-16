package View;

import java.util.Scanner;

import Controll.ControleExec04;

public abstract class Exec04 {
    // Crie um programa que receba dois números e informe na tela o maior entre eles
    public static void Main(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número");
        String entrada1 = scan.nextLine();

        System.out.println("Insira um número");
        String entrada2 = scan.nextLine();

        System.out.println(ControleExec04.Executa(entrada1, entrada2));

        scan.close();
        
    }
}
