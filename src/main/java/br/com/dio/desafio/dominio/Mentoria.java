package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
   private String titulo;
   private String descricao;
    private LocalDate data;

    public Mentoria() {

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}