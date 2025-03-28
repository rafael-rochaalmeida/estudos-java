package br.com.reserva.livro;

public class Reserva {

    private Livro livro;

    private Leitor leitor;

    public Reserva(Livro livro, Leitor leitor) {
        this.livro = livro;
        this.leitor = leitor;
    }

    public void realizarReserva(Reserva reserva) {

        if (!reserva.livro.getReservado()) {

            reserva.livro.setReservado(true);
            System.out.println("Olá " + reserva.leitor.getNomeLeitor() + ", realizada a reserva do livro" + reserva.livro.getNomeLivro() + " com sucesso!");
        } else {

            System.out.println( "Olá " + reserva.leitor.getNomeLeitor() + ", infelizmente não foi possível fazer reserva do livro " + reserva.livro.getNomeLivro() + ", pois ele já está reservado!");

        }
    }

    public void devolverLivro(Reserva reserva) {

        if (reserva.livro.getReservado()) {
            reserva.livro.setReservado(false);
            System.out.println("Olá " + reserva.leitor.getNomeLeitor() + ", realizada a devolução do livro " + reserva.livro.getNomeLivro() + "com sucesso!");
        } 

    }

}
