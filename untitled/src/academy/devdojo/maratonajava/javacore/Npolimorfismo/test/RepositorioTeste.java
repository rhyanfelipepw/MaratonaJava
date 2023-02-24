package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositoryDataBase;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.salvar();
    }
}
