package View;

import java.util.Scanner;

import Controll.ControleExec07;

public class Exec07 {
    public static void Main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número inteiro menor que 0 e veja os números entre ele e 0");
        String entrada = scan.next();

        System.out.println(ControleExec07.Executa(entrada));
        scan.close();
    }
}
