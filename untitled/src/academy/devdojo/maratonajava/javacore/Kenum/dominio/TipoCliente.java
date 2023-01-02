package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public String descPessoa;
    TipoCliente(int valor, String descPessoa) {
        this.VALOR = valor;
        this.descPessoa = descPessoa;
    }

    public static TipoCliente pegaClientePorNome(String nomeCliente){
        for (TipoCliente valueCliente : values()) {
            if(valueCliente.getDescPessoa() == nomeCliente)
                return valueCliente;
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getDescPessoa() {
        return descPessoa;
    }
}
