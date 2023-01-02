package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    // EXEMPLO DEMONSTRANDO QUE CLASSES DO MESMO PACOTE CONSEGUEM TER ACESSO DIRETO AS VARIAVEIS CASO SEJA "PROTECTED"
    public void teste(){
        Pessoa p = new Pessoa("Rhyan");
        p.nome = "";
    }
}
