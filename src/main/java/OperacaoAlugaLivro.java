public class OperacaoAlugaLivro implements Runnable {
    private Livro livro;
    private Pessoa pessoa;

    public OperacaoAlugaLivro(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.pessoa = pessoa;
    }

    public synchronized void reservarLivro() {
        System.out.println("Iniciando reserva");
        if (livro.getDisponivel()) {
            livro.setDisponivel(false);
            livro.setReservista(pessoa);
            System.out.println("Reserva efetuada com sucesso! Aproveite a leitura, " + livro.getReservista().getName());
            System.out.println("Reserva finalizda.");
        } else {
            System.out.println("Livro indisponível no momento, está alugado por: " + livro.getReservista().getName());
        }
    }

    @Override
    public void run() {
        this.reservarLivro();
        System.out.println(Thread.currentThread().getName());
    }

}
