import java.util.ArrayList;

import Model.Pessoa;
import Model.DAL.PessoaDAL;

public class App {
    public static void main(String[] args) throws Exception {
        
        // if (PessoaDAL.AddPessoa(new Pessoa(
        //     0,
        //     "Alfredo Wagner",
        //     72,
        //     "88459999",
        //     "Homenageado"
        // ))){
        //     System.out.println("Inserido com sucesso");
        // } else {
        //     System.out.println("Não foi inserido");
        // };

        ArrayList<Pessoa> pessoas = PessoaDAL.GetPessoas();
        for (Pessoa p : pessoas) {
            System.out.println(p.toString());
        }
    }
}
