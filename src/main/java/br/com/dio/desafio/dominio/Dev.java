package br.com.dio.desafio.dominio;

import java.util.*;


public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosCloncluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
         this.conteudosInscritos.addAll(bootcamp.getConteudos());
         bootcamp.getDevsInscritos().add(this);

    }
    public void progredir() {
       Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosCloncluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else {
            System.err.println("Voce não està matriculado em nenhum conteudo!");
        }
    }
    public double calcularTotalXp() {
        return this.conteudosCloncluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getCouteudosInscritos() {
        return conteudosInscritos;
    }

    public void setCouteudosInscritos(Set<Conteudo> couteudosInscritos) {
        this.conteudosInscritos = couteudosInscritos;
    }

    public Set<Conteudo> getConteudosCloncluidos() {
        return conteudosCloncluidos;
    }

    public void setConteudosCloncluidos(Set<Conteudo> conteudosCloncluidos) {
        this.conteudosCloncluidos = conteudosCloncluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosCloncluidos, dev.conteudosCloncluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosCloncluidos);
    }
}
