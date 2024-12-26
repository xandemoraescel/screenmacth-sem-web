package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*Informações
*@JsonProperty("imdbVotes") String votos) {
*@JsonAlias -  vicular o campo da api com o campo da classe
*@JsonProperty - ler o campo da api e escrever o nome do campo conforme esta na api
*@JsonAlias("Title") String titulo, - personalizar um range de vinculação da api com a classe
*
*
*
*
 */


//desconsiderar tudo que nao declarei
@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao){

}
