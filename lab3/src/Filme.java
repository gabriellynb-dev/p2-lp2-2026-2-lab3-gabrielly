import java.util.Objects;

public class Filme {
    private String nome;
    private int anoLancamento;
    private String plataforma;
    private int posicao;
    private String status;

    public Filme(int posicao, String nome, int anoLancamento, String plataforma) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.plataforma = plataforma;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getPlataforma() {
        return plataforma;
    }


    public int getPosicao() {
        return posicao;
    }

    public String getStatus() {
        return status;
    }

    public void adicionaHot() {
        this.status = "\uD83D\uDD25";
    }

    public void removeHot() {
        this.status = null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof Filme)) {
            return false;
        }

        Filme oFilme = (Filme) o;
        return (this.nome.equals(oFilme.getNome()) &&
                this.anoLancamento == oFilme.getAnoLancamento());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return this.posicao + " " + this.nome + " " + this.anoLancamento +
                this.plataforma;
    }
}
