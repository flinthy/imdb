package sohfilmes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class CatalogoFilmes {
    private List<Filme> filmes;
    private List<Ator> atores;
    private List<Diretor> diretores;

    public CatalogoFilmes() {
        this.filmes = new ArrayList<>();
        this.atores = new ArrayList<>();
        this.diretores = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void cadastrarAtor(Ator ator) {
        this.atores.add(ator);
    }

    public void cadastrarDiretor(Diretor diretor) {
        this.diretores.add(diretor);
    }

    public void associarFilmeAtoresDiretor(Filme filme, Ator atores, Diretor diretor) {
        filme.associarDiretor(diretor);
        filme.adicionarAtor(atores);
    }

    public Filme pesquisarFilme(String nomeFilme) {
        for (Filme filme : filmes) {
            if (filme.getNome().toLowerCase(Locale.ROOT).contains(nomeFilme.toLowerCase(Locale.ROOT))) {
                return filme;
            }
        }
        return null;
    }
}