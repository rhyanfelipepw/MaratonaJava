package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome );
        System.out.println(this.idade);
    }

    // Setters são utilizados para atribuir valores a  atributos privados de objetos
    public void setNome(String nome) {
        if (nome.equals(""))
            System.out.println("Nome inválido");
        else
            this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0)
            System.out.println("Idade inválida");
        else
            this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
