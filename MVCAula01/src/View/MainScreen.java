package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controll.Controle;

public class MainScreen {

    public static void Main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Seja bem vindo a Smart CowCulator");
        while (true) {
            MenuBasico();
            String operador = scan.nextLine();
            if (operador.equals("1")) {
                try {
                    System.out.println("Numero 1");
                    String numero1 = scan.nextLine();
                    System.out.println("Operador");
                    operador = scan.nextLine();
                    System.out.println("Numero 2");
                    String numero2 = scan.nextLine();

                    System.out.println(Controle.Calcular(numero1, operador, numero2));

                } catch (Exception e) {

                }
            } else if (operador.equals("2")) {
                System.out.println("Obrigado por usar a calculadora");
                scan.close();
                return;
            } else if (operador.equals("3")) {
                MotraLista(Controle.GetHistorico());
            } else {
                System.out.println("Não entendi");
            }

        }

    }

    private static void MenuBasico() {
        System.out.println("1 - Calcular");
        System.out.println("2 - Sair");
        System.out.println("3 - Mostra contas");
    }

    private static void MotraLista(ArrayList<?> lista) {
        for (Object object : lista) {
            System.out.println(object.toString());
        }
    }

}
