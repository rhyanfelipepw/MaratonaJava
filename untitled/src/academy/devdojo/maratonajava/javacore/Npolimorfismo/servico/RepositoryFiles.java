package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryFiles implements Repository {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
