import java.util.ArrayList;
import java.util.Scanner;

abstract class BackEnd {

    public static Pessoa EfetuarLogin(ArrayList<Pessoa> usuarios, String userName, String passWord) {

        // foreach
        for (Pessoa pessoa : usuarios) {
            if (pessoa.getAccount().EfetuaLogin(userName, passWord)) {
                return pessoa;
            }
        }

        return new Pessoa(-1);

    }

    /*
     * Todas as contas podem trocar a própria senha e dar logOut
     * 4 < Nível de acesso < 8, pode trocar a senha de
     * outros usuários com nível inferior
     * Nível de acesso >= 8, pode trocar a senha de
     * outros usuários com o nível inferior e pode excluir e incluir
     * usuários de nível inferior
     */

    public static void ExecutaComando(
            ArrayList<Pessoa> usuarios, Pessoa user, int escolha, Scanner scan) {

        if (escolha == 1) {
            System.out.println("Qual a nova senha?");
            user.getAccount().setPassWord(scan.nextLine());
        } else if (escolha == 2) {
            if (user.getAccount().getNivelAcesso() <= 4) {
                AcesInv();
            } else {
                ShowNivel(usuarios, user);
                System.out.println("Qual o id da conta que deseja alterar?");
                int idEscolha = Commom.ToInt(scan.nextLine());
                int index = ChecaNivel(usuarios, user.getAccount().getNivelAcesso(), idEscolha);
                if (index == -1) {
                    AcesInv();
                } else if (index == -2) {
                    System.out.println("Id não encontrado");
                } else {
                    System.out.println("Qual a nova senha?");
                    usuarios.get(index).getAccount().setPassWord(scan.nextLine());
                }
            }
        } else if (escolha == 3) {
            if (user.getAccount().getNivelAcesso() > 8) {
                System.out.println("Qual o nível de acesso da conta?");
                int nivelAcesso = Integer.parseInt(scan.nextLine());
                if (nivelAcesso < user.getAccount().getNivelAcesso()) {
                    // Pessoa temp = CreatePerson(scan, nivelAcesso, usuarios.getLast().getId() +
                    // 1);
                    usuarios.add(CreatePerson(scan, nivelAcesso, usuarios.getLast().getId() + 1));
                } else {
                    AcesInv();
                }
            } else {
                AcesInv();
            }

        } else if (escolha == 4) {
            if (user.getAccount().getNivelAcesso() < 8) {
                AcesInv();
            } else {

                ShowNivel(usuarios, user);
                System.out.println("Qual o id da conta que deseja Remover?");
                int idEscolha = Commom.ToInt(scan.nextLine());
                int index = ChecaNivel(usuarios, user.getAccount().getNivelAcesso(), idEscolha);
                if (index == -1) {
                    AcesInv();
                } else if (index == -2) {
                    System.out.println("ID não encontrado");
                } else {
                    usuarios.remove(index);
                    System.out.println("Usuario Removido");
                }
            }

        } else {
            System.out.println("Opção inválida");
        }

    }

    // AcessoInvalido()
    private static void AcesInv() {
        System.out.println("Nível de acesso inválido");
    }

    private static void ShowNivel(ArrayList<Pessoa> pessoas, Pessoa user) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getAccount().getNivelAcesso() < user.getAccount().getNivelAcesso()) {
                System.out.println(pessoas.get(i).toString());
                System.out.println("---------------");
            }
        }
    }

    private static int ChecaNivel(ArrayList<Pessoa> usuarios, int nivelAcesso, int escolhaId) {

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == escolhaId) {
                if (usuarios.get(i).getAccount().getNivelAcesso() >= nivelAcesso) {
                    return -1;
                } else {
                    return i;
                }
            }
        }

        return -2;

    }

    private static Pessoa CreatePerson(Scanner scan, int nivelAcesso, int id) {
        System.out.println("Qual o nome da pessoa?");
        String nome = scan.nextLine();

        System.out.println("Qual a idade da pessoa?");
        int idade = Integer.parseInt(scan.nextLine());

        System.out.println("Qual o CPF da pessoa?");
        String cpf = scan.nextLine();

        System.out.println("Qual o Login da pessoa?");
        String loginUser = scan.nextLine();

        System.out.println("Qual o Password da pessoa?");
        String passUser = scan.nextLine();

        return new Pessoa(
                id,
                nome,
                idade,
                cpf,
                new Login(
                        loginUser,
                        passUser,
                        nivelAcesso));
    }

}
