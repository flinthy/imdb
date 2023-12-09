package sohfilmes;

class Diretor extends Pessoa {
    private String experiencia;

    public Diretor(String nome, String dataNascimento, String experiencia) {
        super(nome, dataNascimento);
        this.experiencia = experiencia;
    }

    @Override
    public String exibirInformacoes() {
        return String.format("Diretor: %s, Experiência: %s", super.getNome(), experiencia);
    }
}