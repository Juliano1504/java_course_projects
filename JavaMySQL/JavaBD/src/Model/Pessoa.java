package Model;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String emprego;
    public Pessoa(int id, String nome, int idade, String cpf, String emprego) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.emprego = emprego;
    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmprego() {
        return emprego;
    }
    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    public String toString(){
        return "Id:" + id + "| Nome:" + nome + "| Idade" + idade + "| CPF:" + cpf + "| Emprego:" + emprego;
    }
}
