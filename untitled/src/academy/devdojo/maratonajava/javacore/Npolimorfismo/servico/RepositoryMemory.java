package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
