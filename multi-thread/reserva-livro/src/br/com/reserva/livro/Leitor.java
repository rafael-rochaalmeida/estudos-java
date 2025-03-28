package br.com.reserva.livro;

public class Leitor {

    private String nomeLeitor;
    private Integer cpf;

    public Leitor(String nomeLeitor, Integer cpf) {
        this.nomeLeitor = nomeLeitor;
        this.cpf = cpf;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    

}
