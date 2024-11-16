package View;

import java.util.Scanner;

import Controll.ControleExec05;

public abstract class Exec05 {
    // Crie um programa que receba três números e informe na tela o maior entre eles
    public static void Main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        String entrada1 = scan.nextLine();

        System.out.println("Insira o primeiro número: ");
        String entrada2 = scan.nextLine();

        System.out.println("Insira o primeiro número: ");
        String entrada3 = scan.nextLine();

        System.out.println(ControleExec05.Executa(entrada1, entrada2, entrada3));
        scan.close();
    }
}
