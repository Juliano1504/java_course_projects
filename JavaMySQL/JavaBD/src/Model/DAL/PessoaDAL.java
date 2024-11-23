package Model.DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Pessoa;

public abstract class PessoaDAL {
    
    public static boolean AddPessoa(Pessoa pessoa){
        
        String insert = "Insert into pessoa (nome, idade, cpf, emprego) values (?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConnection().prepareStatement(insert);
            ps.setString(1, pessoa.getNome());
            ps.setInt(2, pessoa.getIdade());
            ps.setString(3, pessoa.getCpf());
            ps.setString(1, pessoa.getEmprego());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public static ArrayList<Pessoa> GetPessoas(){

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        try {
            String select = "Select * from pessoa";
            PreparedStatement ps = null;
            ps = Conexao.getConnection().prepareStatement(select);
            ResultSet result = ps.executeQuery();

            while(result.next()){
                pessoas.add(new Pessoa(
                    result.getInt("Id"),
                    result.getString("Nome"),
                    result.getInt("Idade"),
                    result.getNString("CPF"),
                    result.getNString("Emprego")
                ));
            }

            ps.close();
            return pessoas;
        } catch (Exception e) {
            return null;
        }
    }
}
