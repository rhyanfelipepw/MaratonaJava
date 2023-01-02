package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salarios;
    private float media;

    public void imprimirOsDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salários: ");
        if (salarios == null)
            return;
        for (float temp : this.salarios) {
            System.out.println(temp);
        }
    }

    public void mediaSalarial() {

        if (salarios == null)
            System.out.println("Não foi possivel realizar a media. Não há valores informados no campo salário");
        for (int i = 0; i < salarios.length; i++) {
            media = +salarios[i];
        }
        media /= this.salarios.length;
        System.out.println("Media salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public void setSalarios(float[] salarios) {
        this.salarios = salarios;
    }

    public float getMedia() {
        return media;
    }
}
