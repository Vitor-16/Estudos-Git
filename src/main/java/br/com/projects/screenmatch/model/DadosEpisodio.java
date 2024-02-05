package br.com.projects.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode") Integer numeroEpisodio,
                            @JsonAlias("imbdRating") String avaliacao,
                            @JsonAlias("Released") String dataLancamento) {
}
