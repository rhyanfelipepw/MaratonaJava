package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
