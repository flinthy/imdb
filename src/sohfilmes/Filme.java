package sohfilmes;

import java.util.ArrayList;
import java.util.List;

class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.atores = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator) {
        this.atores.add(ator);
    }

    public void associarDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public String exibirInformacoes() {
        StringBuilder infoAtores = new StringBuilder();
        for (Ator ator : atores) {
            infoAtores.append(ator.exibirInformacoes()).append("\n");
        }

        return String.format(
                "Filme: %s\nData de Lançamento: %s\nOrçamento: %.2f\nDescrição: %s\nDiretor: %s\nAtores:\n%s",
                nome, dataLancamento, orcamento, descricao, diretor.exibirInformacoes(), infoAtores.toString());
    }

    public String getNome() {
        return nome;
    }
}