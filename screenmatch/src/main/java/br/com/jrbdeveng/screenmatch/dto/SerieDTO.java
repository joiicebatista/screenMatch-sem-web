package br.com.jrbdeveng.screenmatch.dto;

import br.com.jrbdeveng.screenmatch.model.Categoria;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double avaliacao,
                       Categoria genero,
                       String poster,
                       String sinopse,
                       String atores) {
}
