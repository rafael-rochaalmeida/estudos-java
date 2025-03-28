package br.com.reserva.livro;

public class Livro {

    private String nomeLivro;
    private boolean reservado;

    public Livro(String nomeLivro, String autor) {
        this.nomeLivro = nomeLivro;
    }


    public String getNomeLivro() {
        return nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }


    public boolean getReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    
    
}
