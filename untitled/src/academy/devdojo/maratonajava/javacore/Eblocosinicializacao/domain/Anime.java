package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória pra objeto
    // 2 - Cada Atributo de classe é criado e inicializado com os valores default ou os parametros
    // 3 - BLOCOS DE INICALIZAO DE INSTANCIA ( OU BLOCO DE INICIALIZACAO NÃO-ESTÁTICO ) É EXECUTADO SEMPRE ANTES DO CONSTRUTOR
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco");
        episodios = new int[100];
        for (int i = 0; i < this.episodios.length ; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime(){
        for (int episodio: this.episodios) {
            System.out.println(episodio +  "");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
