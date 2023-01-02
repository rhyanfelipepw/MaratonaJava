package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória pra objeto
    // 2 - Cada Atributo de classe é criado e inicializado com os valores default ou os parametros
    // 3 - BLOCOS DE INICALIZAO DE INSTANCIA ( OU BLOCO DE INICIALIZACAO NÃO-ESTÁTICO ) É EXECUTADO SEMPRE ANTES DO CONSTRUTOR
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco");
        episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length ; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco 2");
    }
    static {
        System.out.println("Dentro do bloco 3");
    }

    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime(){
        for (int episodio: Anime.episodios) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
