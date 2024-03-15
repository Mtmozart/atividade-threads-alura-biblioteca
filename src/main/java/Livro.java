public class Livro {
    private int id;
    private String name;
    private Pessoa reservista;
    private Boolean disponivel;


    public Livro(int id, String name) {
        this.id = id;
        this.name = name;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Pessoa getReservista() {
        return reservista;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setReservista(Pessoa reservista) {
        this.reservista = reservista;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}

