package sohfilmes;

abstract class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String exibirInformacoes() {
        return null;
    }

    public String getNome() {
        return nome;
    }
}