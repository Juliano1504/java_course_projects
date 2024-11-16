package View;

import java.util.Scanner;

import Controll.ControleExec06;

public abstract class Exec06 {
    // Crie um programa que receba um número inteiro maior que zero e mostre todos números entre ele e 0
    public static void Main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número inteiro maior que 0 e veja todos os números entre ele e 0");
        String entrada = scan.nextLine();

        System.out.println(ControleExec06.Executa(entrada));
        scan.close();
    }
}
