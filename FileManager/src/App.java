import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Crie um programa que contenha Login e Senha de três contas,
         * solicite ao usuário um login e senha, caso estejam corretos
         * mostre na tela “Login efetuado” caso contrário mostre “Login
         * ou senha inválidos”
         */

        /*
         * Todas as contas podem trocar a própria senha e dar logOut
         * 4 < Nível de acesso < 8, pode trocar a senha de
         * outros usuários com nível inferior
         * Nível de acesso >= 8, pode trocar a senha de
         * outros usuários com o nível inferior e pode excluir e incluir
         * usuários de nível inferior
         */

        Scanner scan = new Scanner(System.in);
        File myFile = new File("");

        try {

            myFile = new File("C:\\Users\\74589\\Documents\\Usuarios.csv");
            if (myFile.exists()) {
                System.out.println("O Arquivo ja existia -> " + myFile.getName());
            } else {
                myFile.createNewFile();
                System.out.println("Arquivo criado com o nome de -> " + myFile.getName());
            }

        } catch (Exception e) {
            System.out.println("Arquivo não encontrado");
        }

        ArrayList<Pessoa> pessoas = FileManager.csvSeparator(myFile);

        Commom.ShowList(pessoas);

        Pessoa usuario;
        while (true) {

            System.out.println("Insira o UserName");
            String tempUser = scan.nextLine();
            System.out.println("Insira o Password");
            String tempPass = scan.nextLine();

            usuario = BackEnd.EfetuarLogin(pessoas, tempUser, tempPass);
            if (usuario.getId() == -1) {
                System.out.println("UserName ou PassWord inválidos");
            } else {
                System.out.println("Login Efetuado com sucesso");
                System.out.println("Seja bem vindo " + usuario.getAccount().getUserName());
                break;
            }
        }

        while (true) {
            Menu(usuario.getAccount().getNivelAcesso());
            int escolha = Commom.ToInt(scan.nextLine());
            if (escolha == 5) {
                System.out.println("LogOut Efetuado");
                break;
            } else if (escolha == 6)
                Commom.ShowList(pessoas);
            else {
                BackEnd.ExecutaComando(pessoas, usuario, escolha, scan);
            }

        }

        FileWriter changer = new FileWriter(myFile);

        changer.write(TextBuilder(pessoas));

        changer.close();
        scan.close();

        // Este é o arquivo
        // File myFile = new File("C:\\Users\\74589\\Documents\\Usuarios.csv");
        // if(myFile.exists()){
        // System.out.println("O Arquivo ja existia -> " + myFile.getName());
        // }else{
        // myFile.createNewFile();
        // System.out.println("Arquivo criado com o nome de -> " + myFile.getName());
        // }

        // ArrayList<Pessoa> pessoas = FileManager.csvSeparator(myFile);

        // for (Pessoa pessoa : pessoas) {
        // System.out.println(pessoa.getId());
        // System.out.println(pessoa.getAccount().getUserName());
        // }

        // Este é o leitor do arquivo
        // Scanner fileManager = new Scanner(myFile);
        // Este é o escritor do arquivo
        // FileWriter fileInput = new FileWriter(myFile);

        // fileInput.write("Meu arquivo deu certooooo");
        // fileInput.append(null)

        // fileManager.close();
        // fileInput.close();

    }

    /*
     * Todas as contas podem trocar a própria senha e dar logOut
     * 4 < Nível de acesso < 8, pode trocar a senha de
     * outros usuários com nível inferior
     * Nível de acesso >= 8, pode trocar a senha de
     * outros usuários com o nível inferior e pode excluir e incluir
     * usuários de nível inferior
     */
    public static void Menu(int nivelAcesso) {
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - Mudar senha");
        if (nivelAcesso > 4 && nivelAcesso < 8) {
            System.out.println("2 - Mudar senha de outro usuario");
        } else if (nivelAcesso >= 8) {
            System.out.println("2 - Mudar senha de outro usuario");
            System.out.println("3 - Adicionar usuario");
            System.out.println("4 - Remover usuario");
        }
        System.out.println("5 - LogOut");
    }

    public static String TextBuilder(ArrayList<Pessoa> list) {
        String retorno = "ID;NomeUsuario;Senha;NivelDeAcesso;Nome;Idade;CPF\n";
        for (Pessoa pessoa : list) {
            retorno += pessoa.getId() + ";";
            retorno += pessoa.getAccount().getUserName() + ";";
            retorno += pessoa.getAccount().getPassWord() + ";";
            retorno += pessoa.getAccount().getNivelAcesso() + ";";
            retorno += pessoa.getNome() + ";";
            retorno += pessoa.getIdade() + ";";
            retorno += pessoa.getCpf() + "\n";
        }
        return retorno;
    }

}
