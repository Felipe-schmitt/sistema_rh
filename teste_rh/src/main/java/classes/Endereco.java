package classes;

import enums.Estados;

public class Endereco {
    private Estados estados;
    private String cidade;
    private String bairro;
    private String Rua;
    private String numero;
    private String complemento;

    public Endereco(Estados estados, String cidade, String bairro, String rua, String numero,
            String complemento) {
        this.estados = estados;
        this.cidade = cidade;
        this.bairro = bairro;
        Rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Estados geteEstados() {
        return estados;
    }

    public void setestados(Estados estados) {
        this.estados = estados;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
