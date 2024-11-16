package View;

import java.util.Scanner;

import Controll.ControleExec01;

public abstract class Exec01 {
    // Crie um programa que receba um número e informe na
    // tela se ele é maior que 10

    public static void Main(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número qualquer");
        String entrada = scan.nextLine();
        System.out.println(ControleExec01.Executa(entrada));
        
        scan.close();

    }




}
