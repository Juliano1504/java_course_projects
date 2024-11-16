package View;

import java.util.Scanner;

import Controll.ControleExec08;

public class Exec08 {
    public static void Main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número inteiro e veja os números entre ele e 0");
        String entrada = scan.nextLine();

        System.out.println(ControleExec08.Executa(entrada));
        scan.close();
    }
}
