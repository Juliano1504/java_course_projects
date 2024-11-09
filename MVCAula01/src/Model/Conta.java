package Model;

public class Conta {
    private Double numero1;
    private Double numero2;
    private String operador;
    
    public Conta(Double numero1, String operador, Double numero2) {
        this.numero1 = numero1;
        this.operador = operador;
        this.numero2 = numero2;
    }

    public Conta(){
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String toString() {
        return numero1 + operador + numero2;
    }
}
