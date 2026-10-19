public class FilmNow {
    private String[] filmes;
    private static final int MAXIMO = 100;

    public FilmNow(String[] filmes) {
        this.filmes = new String[MAXIMO];
    }

    public String[] getFilmes() {
        return filmes.clone();
    }


}
