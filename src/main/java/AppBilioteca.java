public class AppBilioteca {
    public static void main(String[] args) {
        System.out.println( Thread.currentThread().getName());
        Livro livro = new Livro(1, "1984");
        Pessoa pessoa1 = new Pessoa(1, "Matheus");
        var reservar = new OperacaoAlugaLivro(livro, pessoa1);

        reservar.reservarLivro();
        Thread reservar1 = new Thread(reservar);
        Thread reservar2 = new Thread(reservar);

        reservar1.start();
        reservar2.start();
        System.out.println( "----------------------");
        try {
            reservar1.join();
            reservar2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Progama finalizado.");
    }
}
